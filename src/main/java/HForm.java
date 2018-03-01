public class HForm {
    private static final double ZERO = 0.0;
    private double a;
    private double b;
    private double c;
    private double d;


    //    Primal forms
    public double firstForm() {
        return (a * d) - (b * c);
    }

    public double secondForm() {
        return (a * c) + (b * d);
    }

    //    Complementary forms
    public double zeroForm() {
        if (secondForm() == ZERO) return ZERO;
        return firstForm() / secondForm();
    }

    public double firstFormDownRound() {
        double denominator = c + d;
        if (denominator == ZERO) return ZERO;
        return firstForm() / denominator;
    }

    public double secondFormDownRound() {
        double denominator = c + d;
        if (denominator == ZERO) return ZERO;
        return secondForm() / denominator;
    }

    public double firstFormTopRound() {
        double denominator = a + b;
        if (denominator == ZERO) return ZERO;
        return firstForm() / denominator;
    }

    public double secondFormTopRound() {
        double denominator = a + b;
        if (denominator == ZERO) return ZERO;
        return secondForm() / denominator;
    }

    public double firstFormDownSquare() {
        double denominator = (c * c) + (d * d);
        if (denominator == ZERO) return ZERO;
        return firstForm() / denominator;
    }

    public double secondFormDownSquare() {
        double denominator = (c * c) + (d * d);
        if (denominator == ZERO) return ZERO;
        return secondForm() / denominator;
    }

    public double firstFormTopSquare() {
        double denominator = (a * a) + (b * b);
        if (denominator == ZERO) return ZERO;
        return firstForm() / denominator;
    }

    public double secondFormTopSquare() {
        double denominator = (a * a) + (b * b);
        if (denominator == ZERO) return ZERO;
        return secondForm() / denominator;
    }

    public HForm(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }


}
