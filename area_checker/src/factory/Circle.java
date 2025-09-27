package factory;

    class Circle implements Calculable{
    private final double radius;

    Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return 3.14 * radius * radius;
    }
}

