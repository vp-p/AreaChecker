package factory;

class Hexagon implements Calculable {
    private final double side;

    Hexagon(Double side) {
        this.side = side;
    }

    @Override
    public Double calculateArea() {
        return (3.0 * Math.sqrt(3.0) / 2.0) * side * side;
    }
}
