package factory;

    class Circle implements Calculable{
    private final double radius;

    Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
}

