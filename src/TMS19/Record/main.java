package TMS19.Record;

public class main {
    public record Person(String firstName, String lastName, int age) {
        public String fullName() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Anton", "Antonov", 26);
        Person p2 = new Person("Masha", "Petrova", 15);
        Person p3 = new Person("Ivan", "Petorv", 26);

        System.out.println(p1);
        System.out.println("Фамилия: " + p1.lastName);
        System.out.println("Возраст: " + p1.age);
        System.out.println("Объекты равны? " + p2.equals(p3));
        System.out.println("Полное имя: " + p3.fullName());
    }

}
