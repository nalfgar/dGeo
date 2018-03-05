import java.util.ArrayList;
import java.util.List;

public class HForm {
    private static final double ZERO = 0.0;
    private List<List<Double>> data = new ArrayList<List<Double>>();

    //    Primal forms
    public double firstForm() {
        double sum = 0.0;
        for (List<Double> form : data) {
            sum += (form.get(0) * form.get(3)) - (form.get(1) * form.get(2));
        }
        return sum;
    }

    public double secondForm() {
        double sum = 0.0;
        for (List<Double> form : data) {
            sum += (form.get(0) * form.get(2)) + (form.get(1) * form.get(3));
        }

        return sum;
    }

    //    Complementary forms
    public double zeroForm() {
        if (secondForm() == ZERO) return ZERO;

        return firstForm() / secondForm();
    }

    public double firstFormBottomRound() {
        double denominator = 0.0;
        for (List<Double> form : data) {
            denominator += (form.get(2) +form.get(3));
        }
        if (denominator == ZERO) return ZERO;
        return firstForm() / denominator;
    }
//
//    public double secondFormBottomRound() {
//        double denominator = c + d;
//        if (denominator == ZERO) return ZERO;
//        return secondForm() / denominator;
//    }
//
//    public double firstFormTopRound() {
//        double denominator = a + b;
//        if (denominator == ZERO) return ZERO;
//        return firstForm() / denominator;
//    }
//
//    public double secondFormTopRound() {
//        double denominator = a + b;
//        if (denominator == ZERO) return ZERO;
//        return secondForm() / denominator;
//    }
//
//    public double firstFormBottomSquare() {
//        double denominator = (c * c) + (d * d);
//        if (denominator == ZERO) return ZERO;
//        return firstForm() / denominator;
//    }
//
//    public double secondFormBottomSquare() {
//        double denominator = (c * c) + (d * d);
//        if (denominator == ZERO) return ZERO;
//        return secondForm() / denominator;
//    }
//
//    public double firstFormTopSquare() {
//        double denominator = (a * a) + (b * b);
//        if (denominator == ZERO) return ZERO;
//        return firstForm() / denominator;
//    }
//
//    public double secondFormTopSquare() {
//        double denominator = (a * a) + (b * b);
//        if (denominator == ZERO) return ZERO;
//        return secondForm() / denominator;
//    }

    public HForm(double a, double b, double c, double d) {
        List<Double> form = new ArrayList<Double>();
        form.add(a);
        form.add(b);
        form.add(c);
        form.add(d);
        data.add(form);
        }

    public HForm(List<Double> form) {
        data.add(form);
    }

    public void add(List<Double> form) {
        data.add(form);
    }
}
