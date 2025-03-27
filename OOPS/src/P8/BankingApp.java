package q8;

public class BankingApp {
    public static void main(String[] args) {
        Account sa = new SavingsAccount("12340", 5.0);
        Account ca = new CurrentAccount("12345", 200.0);
        sa.deposit(1000);
        sa.withdrawal(500);
        sa.withdrawal(700);

        ca.deposit(500);
        ca.withdrawal(600);
        ca.withdrawal(200);

        System.out.println(sa);
        System.out.println(ca);
    }
}