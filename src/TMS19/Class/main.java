package TMS19.Class;

public class main {
    public static void main(String[] args) {

        Bike bike = new Bike("BMX", 5.2);
        Moto moto = new Moto("Toyota", "Japan");
        Auto auto = new Auto("BMW", 4);

        System.out.println(bike);
        System.out.println(moto);
        System.out.println(auto);
    }
}
