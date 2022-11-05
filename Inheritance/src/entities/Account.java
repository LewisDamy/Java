package entities;

public class Account {
    private Integer account;
    private String holder;
//    private double balance;
    protected double balance;
    public Account() {
    }

    public Account(Integer account, String holder, double balance) {
        this.account = account;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

}
