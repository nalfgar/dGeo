import lombok.Data;


@Data
public class HForm {
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
        if (secondForm() == 0.0) return 0.0;
        return firstForm() / secondForm();
    }

    public double firstFormDownRound() {
        if (c + d == 0.0) return 0.0;
        return firstForm() / (c + d);
    }

    public double secondFormDownRound() {
        if (c + d == 0.0) return 0.0;
        return secondForm() / (c + d);
    }

    public double firstFormTopRound() {
        if (a + b == 0.0) return 0.0;
        return firstForm() / (a + b);
    }

    public double secondFormTopRound() {
        if (a + b == 0.0) return 0.0;
        return secondForm() / (a + b);
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
