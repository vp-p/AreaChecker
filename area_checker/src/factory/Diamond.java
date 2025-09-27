package factory;

class Diamond implements Calculable {
    private final double d1;
    private final double d2;

    Diamond(Double d1, Double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public Double calculateArea() {
        return (d1 * d2) / 2.0;
    }
}
