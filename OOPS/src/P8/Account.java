package q8;

abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.setAccountNumber(accountNumber);
        this.balance = 0.0;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    abstract void deposit(double amount);
    abstract void withdrawal(double amount);
}

