package q8;

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited: " + amount);
    }

    public void withdrawal(double amount) {
        if (amount > getBalance() + overdraftLimit) {
            System.out.println("Withdrawal exceeds overdraft limit");
            ;
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal Amount: " + amount);
        }
    }
}