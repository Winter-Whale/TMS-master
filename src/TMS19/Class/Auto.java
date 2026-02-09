package TMS19.Class;

public final class Auto extends Vehicle {
    private int NumberOfDoors;

    public Auto(String model, int NumberOfDoors) {
        super("BMW", 230, 4);
        this.NumberOfDoors = NumberOfDoors;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        NumberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "NumberOfDoors=" + NumberOfDoors +
                '}';
    }
}
