package TMS8.zadacha1;

class Dantist extends Doctor {
    String name = "Дантист";

    @Override
    String treatment() {
        return "Сделает снимок, удалит старую пломбу, установит коронку";
    }
}