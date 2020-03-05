package job4j.tictactoe;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class Logic3TTest {
    /**
     * просто ткнул кудат о
     * хз зачем он тут метод
     */
    @Test
    public void whenNotFill() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(false));
        assertThat(login.isWinnerX(), is(false));
    }

    /** тут все Х =============== 8 штук ==========
     * диагональ Х сверху слева вниз направо
     */
    @Test
    public void whenHasXDiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    /**
     * х посредине горизонталь
     */
    @Test
    public void whenHasXHorizontalMiddleWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(true, false), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXVerticalMiddleWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXBackDiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXFirstVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXLastVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXUpHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(true, false), new Figure3T(true, false)},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXDownHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(true, false), new Figure3T(true, false), new Figure3T(true, false)}

        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }



    /**
     * тут начало 0 ============== 8 штук=======
     * 1й метод проверяем 1 вертикаль
     */
    @Test
    public void whenHasODiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(false, true), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOHorizontalMiddleWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(false, true), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOVerticalMiddleWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(false, true), new Figure3T()},
                {new Figure3T(), new Figure3T(false, true), new Figure3T()},
                {new Figure3T(), new Figure3T(false, true), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOBackDiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(false, true), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOFirstVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOLastVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(), new Figure3T(false, true)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOUpHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(false, true), new Figure3T(false, true), new Figure3T(false, true)},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    @Test
    public void whenHasODownHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(false, true), new Figure3T(false, true), new Figure3T(false, true)}

        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }

    /**
     * или есть пустые места ? есть
     */
    @Test
    public void whenHasGap() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true, false), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true, false)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.hasGap(), is(true));
    }

    @Test
    public void whenHasNoGap() {
        Figure3T[][] table = {
                {new Figure3T(true, false), new Figure3T(false, true), new Figure3T(true, false)},
                {new Figure3T(false, true), new Figure3T(true, false), new Figure3T(true, false)},
                {new Figure3T(true, false), new Figure3T(false, true), new Figure3T(true, false)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.hasGap(), is(false));
    }
}
