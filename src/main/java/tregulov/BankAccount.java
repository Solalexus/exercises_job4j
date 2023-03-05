package tregulov;

public class BankAccount {
    int id = 10;
    String name = "Petr";
    double balance = 100;

    void popolnenitScheta(double add) {
        System.out.println("Balance do popolneniya: " + balance);
        System.out.println("Balance popolnyaetsya na: " + add);
        balance += add;
        System.out.println("Balance posle popolneniya: " + balance);
        System.out.println();
    }

    double snyatieSoScheta(double minus) {
        balance -= minus;
        return balance;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.popolnenitScheta(500);
    }
}
