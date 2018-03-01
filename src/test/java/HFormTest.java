import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HFormTest {
    private HForm hForm0;
    private HForm hForm1;

    @Before
    public void setup() {
        hForm0 = new HForm(0.0, 0.0, 0.0, 0.0);
        hForm1 = new HForm(10.0, 20.0, 30.0, 40.0);
    }

    @Test
    public void testConstructor() {

        assertThat(hForm0.getA()).isEqualTo(0.0);
        assertThat(hForm0.getB()).isEqualTo(0.0);
        assertThat(hForm0.getC()).isEqualTo(0.0);
        assertThat(hForm0.getD()).isEqualTo(0.0);
    }


    @Test
    public void testFirstForm() {

        assertThat(hForm1.firstForm()).isEqualTo(-200.0);
    }

    @Test
    public void testSecondForm() {

        assertThat(hForm1.secondForm()).isEqualTo(1100.0);
    }

    @Test
    public void testZeroFormZero() {

        assertThat(hForm0.zeroForm()).isEqualTo(0.0);
    }

    @Test
    public void testZeroFormNotZero() {

        assertThat(hForm1.zeroForm()).isEqualTo(-200.0 / 1100.0);
    }

    @Test
    public void testFirstFormDownRoundZero() {

        assertThat(hForm0.firstFormDownRound()).isEqualTo(0.0);
    }

    @Test
    public void testFirstFormDownRoundNotZero() {

        assertThat(hForm1.firstFormDownRound()).isEqualTo(-200.0 / 70.0);
    }

    @Test
    public void testSecondFormDownRoundZero() {

        assertThat(hForm0.secondFormDownRound()).isEqualTo(0.0);
    }

    @Test
    public void testSecondFormDownRoundNotZero() {

        assertThat(hForm1.secondFormDownRound()).isEqualTo(1100.0 / 70.0);
    }

    @Test
    public void testFirstFormTopRoundZero() {
        assertThat(hForm0.firstFormTopRound()).isEqualTo(0.0);
    }

    @Test
    public void testFirstFormTopRoundNotZero() {
        assertThat(hForm1.firstFormTopRound()).isEqualTo(-200.0 / 30.0);
    }

    @Test
    public void testSecondFormTopRoundZero() {
        assertThat(hForm0.secondFormTopRound()).isEqualTo(0.0);
    }

    @Test
    public void testSecondFormTopRoundNotZero() {
        assertThat(hForm1.secondFormTopRound()).isEqualTo(1100.0 / 30.0);
    }

    @Test
    public void testFirstFormDownSquareZero() {
        assertThat(hForm0.firstFormDownSquare()).isEqualTo(0.0);
    }

    @Test
    public void testFirstFormDownSquareNotZero() {
        assertThat(hForm1.firstFormDownSquare()).isEqualTo(-200.0 / (900 + 1600));
    }


}
