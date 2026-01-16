package TMS6;

public class CreditCard {
    int number;
    int balance;

    public CreditCard(int number, int sum) {
        this.balance = sum;
        this.number = number;
    }

    void deposit(int vvod) {
        if (vvod > 0) {
            balance += vvod;
            System.out.println("На счет " + number + " зачислено " + vvod);
        } else {
            System.out.println("Error");
        }
    }

    void withdraw(int vivod) {
        if (vivod <= balance) {
            balance -= vivod;
            System.out.println("Со счета " + number + " снято " + vivod);
        } else {
            System.out.println("Error");
        }
    }

    void Info() {
        System.out.println("Номер счета " + number + " Баланс " + balance);
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1, 500);
        CreditCard card2 = new CreditCard(2, 200);
        CreditCard card3 = new CreditCard(3, 400);

        card1.deposit(200);
        card2.deposit(300);
        card3.withdraw(100);

        System.out.println("Текущее состояние счетов");
        card1.Info();
        card2.Info();
        card3.Info();
    }
}
