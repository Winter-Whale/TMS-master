package TMS8.zadacha1;

class Hirurg extends Doctor {
    String name = "Хирург";

    @Override
    String treatment() {
        return "Сделает снимок, наложит гипс, запишет на перевязку";
    }
}
