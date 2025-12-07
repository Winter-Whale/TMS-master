package TMS7.zadacha2;

class treygolnik extends Figyra {
    private double a, b, c;

    public treygolnik(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPlochad() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }
}