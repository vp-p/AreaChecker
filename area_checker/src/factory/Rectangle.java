package factory;

class Rectangle implements Calculable {
    private final double width;
    private final double height;

    Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return width * height;
    }
}
