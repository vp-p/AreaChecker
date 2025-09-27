package factory;

class Triangle implements Calculable {
    private final double base;
    private final double height;

    Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return (base * height) / 2.0;
    }
}

