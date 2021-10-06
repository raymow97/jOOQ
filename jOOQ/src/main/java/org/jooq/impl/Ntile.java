/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.impl.Names.N_NTILE;
import static org.jooq.impl.SQLDataType.INTEGER;

import java.util.function.BiFunction;
import java.util.function.Predicate;

import org.jooq.Context;
import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.QueryPart;

/**
 * @author Lukas Eder
 */
final class Ntile extends AbstractWindowFunction<Integer> implements QOM.Ntile {

    private final Field<Integer> tiles;

    Ntile(Field<Integer> tiles) {
        super(N_NTILE, INTEGER.notNull());

        this.tiles = tiles;
    }

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {





            default:
                ctx.visit(N_NTILE).sql('(').visit(tiles).sql(')');
                break;
        }

        acceptOverClause(ctx);
    }

    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Field<Integer> $tiles() {
        return tiles;
    }

    @Override
    public final <R> R $traverse(
        R init,
        Predicate<? super R> abort,
        Predicate<? super QueryPart> recurse,
        BiFunction<? super R, ? super QueryPart, ? extends R> accumulate
    ) {
        return QOM.traverse(init, abort, recurse, accumulate, this, tiles, $windowSpecification() != null ? $windowSpecification() : $windowDefinition());
    }

    @Override
    public final QueryPart $replace(
        Predicate<? super QueryPart> recurse,
        Function1<? super QueryPart, ? extends QueryPart> replacement
    ) {
        return QOM.replace(
            this,
            tiles, $windowSpecification(), $windowDefinition(),
            (t, s, d) -> new Ntile(t).$windowSpecification(s).$windowDefinition(d),
            recurse,
            replacement
        );
    }
}
