package TMS9;

public class Rabbit extends Animal {


    @Override
    public void voice() {
        System.out.println("Кролик издает звук: Fr-fr-fr");
    }

    @Override
    public void eat(String food) {
        if ("Grass".equals(food)) {
            System.out.println("Кролик любит есть траву");
        } else {
            System.out.println("Кролик недоволен");
        }
    }
}
