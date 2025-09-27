package factory;

class Square implements Calculable {
    private final double side;

    Square(Double side) {
        this.side = side;
    }
    @Override 
    public Double calculateArea() {
        return side * side;
    }
}

