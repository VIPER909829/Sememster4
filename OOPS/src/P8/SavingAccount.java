package q8;

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        double interest = amount * (interestRate / 100.0);
        double totalamt = amount + interest;
        setBalance(getBalance() + totalamt);
        System.out.println("Deposited Amount: " + amount + " Interest: " + interest + " Total Amount: " + totalamt);

    }

    public void withdrawal(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient Balance");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal Amount: " + amount);
        }
    }
}