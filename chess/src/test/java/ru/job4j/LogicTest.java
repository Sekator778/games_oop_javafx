package ru.job4j;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LogicTest {
    /**
     * простое нормальное движение
     */
        @Test
        public void whenMoveTrueTest() {
            Logic logic = new Logic();
            BishopBlack bishopBlack = new BishopBlack(Cell.B1);
            logic.add(bishopBlack);
            assertThat(logic.move(Cell.B1, Cell.H7), is(true));
        }

    /**
     * wrong move Test
     * catch exception
     */
    @Test(expected = IllegalStateException.class)
    public void whenMoveFalseTest() {
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        logic.add(bishopBlack);
        assertThat(logic.move(Cell.B1, Cell.B7), is(true));
    }

    /**
     * test another figure from my way
     */
    @Test(expected = IllegalStateException.class)
    public void whenMoveFromFigureOnWay() {
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        BishopBlack bishopBlack2 = new BishopBlack(Cell.G6);
        logic.add(bishopBlack);
        logic.add(bishopBlack2);
        assertThat(logic.move(Cell.B1, Cell.H7), is(true));
    }
}
