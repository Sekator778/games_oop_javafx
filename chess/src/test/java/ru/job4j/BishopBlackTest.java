package ru.job4j;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BishopBlackTest {
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        assertThat(bishopBlack.position(), is(Cell.B1));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        BishopBlack newBishopBlack = (BishopBlack) bishopBlack.copy(Cell.C3);
        assertThat(newBishopBlack.position(), is(Cell.C3));
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.C1, Cell.G5);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(way, is(expect));
    }

    @Test
    public void testDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        BishopBlack bishopBlackWrong = new BishopBlack(Cell.G1);
        BishopBlack bishopBlackTrue = new BishopBlack(Cell.H7);
        boolean result = bishopBlack.isDiagonal(bishopBlack.position(), bishopBlackWrong.position());
        assertThat(result, is(false));
        assertThat(bishopBlackWrong.isDiagonal(
                bishopBlack.position(), bishopBlackTrue.position()
        ), is(true));
    }
}
