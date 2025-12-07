package TMS7.zadacha2;

class pramoygolnik extends Figyra {
    private double width, height;

    public pramoygolnik(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getPlochad() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }
}
