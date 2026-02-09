package TMS19.Class;

public sealed class Vehicle permits Auto, Moto, Bike {

    private String model;
    private int speed;
    private int numberOfWheels;

    public Vehicle(String model, int speed, int numberOfWheels) {
        this.speed = speed;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
