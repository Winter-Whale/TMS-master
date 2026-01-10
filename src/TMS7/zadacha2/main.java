package TMS7.zadacha2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Figyra> shapes = new ArrayList<>(); // Дайте пояснение за эту функцию

        shapes.add(new treygolnik(5, 9, 2));
        shapes.add(new pramoygolnik(10, 6));
        shapes.add(new Krug(9));
        shapes.add(new treygolnik(3, 3, 8));
        shapes.add(new pramoygolnik(4, 10));

        double totalPerimeter = 0;
        for (int i = 0; i < shapes.size(); i++) {
            double perimeter = shapes.get(i).getPerimeter();
            totalPerimeter += perimeter;
        }

        System.out.printf("%nСумма периметров всех фигур: %.2f%n", totalPerimeter);

    }
}
