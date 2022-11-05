package entities;

public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount() {
        super();
    }

    public SavingAccount(Integer account, String holder, double balance, double interestRate) {
        super(account, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount; // don't discount 5.0 from the withdraw
    }
}
