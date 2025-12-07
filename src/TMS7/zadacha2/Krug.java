package TMS7.zadacha2;

class Krug extends Figyra {
    private double radius;

    public Krug(double radius) {
        this.radius = radius;

    }

    @Override
    double getPlochad() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
