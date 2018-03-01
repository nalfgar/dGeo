import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HFormTest {
    private HForm hForm0;
    private HForm hForm1;

    @Before
    public void setup(){
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
    public void testGetFirstForm() {

        assertThat(hForm1.firstForm()).isEqualTo(-200.0);
    }

    @Test
    public void testGetSecondForm() {

        assertThat(hForm1.secondForm()).isEqualTo(1100.0);
    }

    @Test
    public void testGetZeroFormZero() {

        assertThat(hForm0.zeroForm()).isEqualTo(0.0);
    }

    @Test
    public void testGetZeroFormNotZero() {

        assertThat(hForm1.zeroForm()).isEqualTo(-200.0/1100);
    }

    @Test
    public void testGetFirstFormDownRoundZero() {

        assertThat(hForm0.firstFormDownRound()).isEqualTo(0.0);
    }

    @Test
    public void testGetFirstFormDownRoundNotZero() {

        assertThat(hForm1.firstFormDownRound()).isEqualTo(-200.0/70);
    }

}
