package factory;

class Cube implements Calculable {
    private final double side;

    Cube(Double side) {
        this.side = side;
    }

    @Override
    public Double calculateArea() {
        return 6.0 * side * side;
    }
}
