package factory;

public class Square {
    private final double side;

    Square(Double side) {
        this.side = side;
    }

    public Double calculateArea() {
        return side * side;
    }
}

