

import factory.Calculable;
import factory.ShapeFactoryImpl;
import factory.ShapeType;

public class Main {

    private static final double EPS = 1e-6;

    public static void main(String[] args) {
        ShapeFactoryImpl factory = new ShapeFactoryImpl();

        runTest(factory, ShapeType.SQUARE, new Double[]{5.0}, 25.0);
        runTest(factory, ShapeType.RECTANGLE, new Double[]{4.0, 6.0}, 24.0);
        runTest(factory, ShapeType.CIRCLE, new Double[]{3.0}, Math.PI * 9.0);
        runTest(factory, ShapeType.TRIANGLE, new Double[]{6.0, 4.0}, 12.0);
        runTest(factory, ShapeType.PARALLELOGRAM, new Double[]{5.0, 3.0}, 15.0);
        runTest(factory, ShapeType.TRAPEZOID, new Double[]{3.0, 5.0, 4.0}, 16.0);
        runTest(factory, ShapeType.HEXAGON, new Double[]{2.0}, (3.0 * Math.sqrt(3.0) / 2.0) * 4.0);
        runTest(factory, ShapeType.DIAMOND, new Double[]{5.0, 6.0}, 15.0);
        runTest(factory, ShapeType.CUBE, new Double[]{3.0}, 54.0);

        System.out.println("Testes concluídos.");
    }

    private static void runTest(ShapeFactoryImpl factory, ShapeType type, Double[] params, double expected) {
        Calculable shape = factory.getShape(type, params);
        double area = shape.calculateArea();
        boolean pass = Math.abs(area - expected) <= EPS;
        System.out.printf("%-12s -> area=%.6f expected=%.6f %s%n", type.name(), area, expected, pass ? "PASS" : "FAIL");
    }
}
