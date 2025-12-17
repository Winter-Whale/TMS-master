package TMS9;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Собака издает звук: Gav-gav-gav");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Собака любит есть мясо");
        } else {
            System.out.println("Это не мясо");
        }
    }
}
