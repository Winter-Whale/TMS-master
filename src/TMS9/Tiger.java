package TMS9;

public class Tiger extends Animal {

    @Override
    public void voice() {
        System.out.println("Тигр издает звук: Rrrrrr");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Тигр любит есть мясо");
        } else {
            System.out.println("Это не мясо");
        }
    }
}


