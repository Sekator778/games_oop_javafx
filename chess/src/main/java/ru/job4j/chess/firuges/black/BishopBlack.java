package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * @author Petr Arsentev (parsentev@yandex.ru) and I`m
 * @version $Id$
 * @since 0.1.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    /**
     * метод возвращает путь
     * <p>
     * чек или ход будет на диагонали
     * <p>
     * int size = Math.abs(dest.x - source.x);
     * размер скоко шагов скоко ячейек в масиве с точками
     * <p>
     * Чтобы заполнить массив ячеек нужно использовать метод Cell.findBy %)
     *
     * тут 1й раз мне норм тернарника использовать
     *
     * @param source откуда sourceX, sourceY
     * @param dest   куда destX, destY
     * @return масив точек пути
     */
    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not way by diagonal from %s to %s", source, dest)
            );
        }
        int size = Math.abs(dest.x - source.x);
        Cell[] steps = new Cell[size];
        var deltaX = (dest.x - source.x) < 0 ? -1 : 1;
        var deltaY = (dest.y - source.y) < 0 ? -1 : 1;
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(source.x + (index + deltaX), source.y + (index + deltaY));
        }
        return steps;
    }

    /**
     * метод проверяет или путь на диагонали
     * Слон может двигаться в четыре стороны.
     * Эти движения можно описать двумя дельтами +1 -1.
     * Например, если слон двигается вниз влево,
     * то дельты будут -1 -1.
     * <p>
     * Math.abs даст нам 1, 1 без знаков
     *
     * @param source откуда sourceX, sourceY
     * @param dest   куда destX, destY
     * @return result true or false
     */
    public boolean isDiagonal(Cell source, Cell dest) {
        boolean result = false;
        if (Math.abs(dest.x - source.x) == Math.abs(dest.y - source.y)) {
            result = true;
        }
        return result;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
