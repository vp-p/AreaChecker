package factory;

class Parallelogram implements Calculable {
    private final double base;
    private final double height;

    Parallelogram(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return base * height;
    }
}
