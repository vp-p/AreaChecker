package factory;

class Trapezoid implements Calculable {
    private final double base1;
    private final double base2;
    private final double height;

    Trapezoid(Double base1, Double base2, Double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return ((base1 + base2) * height) / 2.0;
    }
}
