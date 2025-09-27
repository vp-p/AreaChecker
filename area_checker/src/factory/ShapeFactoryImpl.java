package factory;

public class ShapeFactoryImpl implements ShapeFactory {

    @Override
    public Calculable getShape(ShapeType type, Double[] values) {
        if (type == null) throw new IllegalArgumentException("type cannot be null");
        if (values == null) throw new IllegalArgumentException("values cannot be null");

        switch (type) {
            case SQUARE:
                requireLength(values, 1);
                return new Square(values[0]);
            case RECTANGLE:
                requireLength(values, 2);
                return new Rectangle(values[0], values[1]);
            case CIRCLE:
                requireLength(values, 1);
                return new Circle(values[0]);
            case TRIANGLE:
                requireLength(values, 2);
                return new Triangle(values[0], values[1]);
            case PARALLELOGRAM:
                requireLength(values, 2);
                return new Parallelogram(values[0], values[1]);
            case TRAPEZOID:
                requireLength(values, 3);
                return new Trapezoid(values[0], values[1], values[2]);
            case HEXAGON:
                requireLength(values, 1);
                return new Hexagon(values[0]);
            case DIAMOND:
                requireLength(values, 2);
                return new Diamond(values[0], values[1]);
            case CUBE:
                requireLength(values, 1);
                return new Cube(values[0]);
            default:
                throw new IllegalArgumentException("Unsupported shape type: " + type);
        }
    }

    private void requireLength(Double[] values, int n) {
        if (values.length < n) {
            throw new IllegalArgumentException("Expected at least " + n + " values, got " + values.length);
        }
    }
}
