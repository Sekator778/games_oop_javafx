package job4j.tictactoe;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }

    private boolean isWinner(Predicate<Figure3T> tPredicate) {
        return
                this.fillBy(tPredicate, 0, 0, 1, 0)
                        || this.fillBy(tPredicate, 0, 0, 0, 1)
                        || this.fillBy(tPredicate, 0, 0, 1, 1)
                        || this.fillBy(tPredicate, 1, 0, 0, 1)
                        || this.fillBy(tPredicate, 0, 1, 1, 0)
                        || this.fillBy(tPredicate, 0, this.table.length - 1, 1, 0)
                        || this.fillBy(tPredicate, this.table.length - 1, 0, -1, 1)
                        || this.fillBy(tPredicate, this.table.length - 1, 0, 0, 1);
    }

    public boolean isWinnerX() {
        return this.isWinner(Figure3T::hasMarkX);

    }

    public boolean isWinnerO() {
        return this.isWinner(Figure3T::hasMarkO);
    }

    public boolean hasGap() {
        return Arrays.stream(this.table).flatMap(Stream::of).anyMatch(cell -> !cell.hasMarkO() && !cell.hasMarkX());
    }
}
