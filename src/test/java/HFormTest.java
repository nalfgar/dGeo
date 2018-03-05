import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class HFormTest {
    private HForm hForm0;
    private HForm hForm1;
    private HForm hForm2;
    private HForm hForm3;
    private HForm hForm4;
    private HForm hForm5;

    @Before
    public void setup() {
        hForm0 = new HForm(0.0, 0.0, 0.0, 0.0);
        hForm1 = new HForm(10.0, 20.0, 30.0, 40.0);

        List<Double> form0 = new ArrayList<Double>();
        form0.add(0.0);
        form0.add(0.0);
        form0.add(0.0);
        form0.add(0.0);
        List<Double> form1 = new ArrayList<Double>();
        form1.add(10.0);
        form1.add(20.0);
        form1.add(30.0);
        form1.add(40.0);
        hForm2 = new HForm(form0);
        hForm3 = new HForm(form1);
        hForm4 = new HForm(form0);
        hForm4.add(form0);
        hForm5 = new HForm(form1);
        hForm5.add(form1);
    }

    @Test
    public void testFirstFormZero() {

        assertThat(hForm0.firstForm()).isEqualTo(0.0);
        assertThat(hForm2.firstForm()).isEqualTo(0.0);
        assertThat(hForm4.firstForm()).isEqualTo(0.0);
    }


    @Test
    public void testFirstForm() {

        assertThat(hForm1.firstForm()).isEqualTo(-200.0);
        assertThat(hForm3.firstForm()).isEqualTo(-200.0);
        assertThat(hForm5.firstForm()).isEqualTo(-400.0);
    }

    @Test
    public void testSecondForm() {

        assertThat(hForm1.secondForm()).isEqualTo(1100.0);
        assertThat(hForm5.secondForm()).isEqualTo(2200.0);
    }

    @Test
    public void testZeroFormZero() {

        assertThat(hForm0.zeroForm()).isEqualTo(0.0);
        assertThat(hForm2.zeroForm()).isEqualTo(0.0);
    }

    @Test
    public void testZeroFormNotZero() {

        assertThat(hForm1.zeroForm()).isEqualTo(-200.0 / 1100.0);
        assertThat(hForm5.zeroForm()).isEqualTo(-400.0 / 2200.0);
    }

    @Test
    public void testFirstFormBottomRoundZero() {

        assertThat(hForm0.firstFormBottomRound()).isEqualTo(0.0);
    }

    @Test
    public void testFirstFormBottomRoundNotZero() {

        assertThat(hForm1.firstFormBottomRound()).isEqualTo(-200.0 / 70.0);
        assertThat(hForm5.firstFormBottomRound()).isEqualTo(-400.0 / (70.0 + 70.0));
    }

    @Test
    public void testSecondFormBottomRoundZero() {

        assertThat(hForm0.secondFormBottomRound()).isEqualTo(0.0);
    }

    @Test
    public void testSecondFormBottomRoundNotZero() {

        assertThat(hForm1.secondFormBottomRound()).isEqualTo(1100.0 / 70.0);
        assertThat(hForm5.secondFormBottomRound()).isEqualTo((2200.0) / (70.0 + 70.0));
    }

    @Test
    public void testFirstFormTopRoundZero() {
        assertThat(hForm0.firstFormTopRound()).isEqualTo(0.0);
    }

    @Test
    public void testFirstFormTopRoundNotZero() {
        assertThat(hForm1.firstFormTopRound()).isEqualTo(-200.0 / 30.0);
        assertThat(hForm5.firstFormTopRound()).isEqualTo(-400.0 / (30.0 + 30.0));
    }

    @Test
    public void testSecondFormTopRoundZero() {
        assertThat(hForm0.secondFormTopRound()).isEqualTo(0.0);
        assertThat(hForm5.secondFormTopRound()).isEqualTo(2200.0 / (30.0 + 30.0));
    }
//
//    @Test
//    public void testSecondFormTopRoundNotZero() {
//        assertThat(hForm1.secondFormTopRound()).isEqualTo(1100.0 / 30.0);
//    }
//
//    @Test
//    public void testFirstFormBottomSquareZero() {
//        assertThat(hForm0.firstFormBottomSquare()).isEqualTo(0.0);
//    }
//
//    @Test
//    public void testFirstFormBottomSquareNotZero() {
//        assertThat(hForm1.firstFormBottomSquare()).isEqualTo(-200.0 / (900.0 + 1600.0));
//    }
//
//    @Test
//    public void testSeconfFormBottomSquareZero() {
//        assertThat(hForm0.secondFormBottomSquare()).isEqualTo(0.0);
//    }
//
//    @Test
//    public void testSeconfFormBottomSquareNotZero() {
//        assertThat(hForm1.secondFormBottomSquare()).isEqualTo(1100.0 / (900.0 + 1600.0));
//    }
//
//    @Test
//    public void testFirstFormTopSquareZero() {
//        assertThat(hForm0.firstFormTopSquare()).isEqualTo(0.0);
//    }
//
//    @Test
//    public void testFirstFormTopSquareNotZero() {
//        assertThat(hForm1.firstFormTopSquare()).isEqualTo(-200.0 / (100 + 400));
//    }
//
//    @Test
//    public void testSecondFormTopSquareZero() {
//        assertThat(hForm0.secondFormTopSquare()).isEqualTo(0.0);
//    }
//
//    @Test
//    public void testSecondFormTopSquareNotZero() {
//        assertThat(hForm1.secondFormTopSquare()).isEqualTo(1100.0/(100+400));
//    }

}
