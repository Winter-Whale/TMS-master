package TMS19.Class;

public final class Bike extends Vehicle {
    private double weight;

    public Bike(String model, double weight) {
        super("Aist", 20, 2);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "weight=" + weight +
                '}';
    }
}
