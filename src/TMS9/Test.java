package TMS9;

public class Test {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();
        Dog dog = new Dog();
        System.out.println("Звуки животных");
        dog.voice();
        tiger.voice();
        rabbit.voice();
        tiger.eat("Meat");
        dog.eat("Meat");
        rabbit.eat("meat");
    }
}
