package entities;

public class BussinessAccount extends Account{
    private double loanLimit;

    public BussinessAccount() {
        super();    // in case there's some modification in the default constructor of super class (Account)
    }

    public BussinessAccount(Integer account, String holder, double balance, double loanLimit) {
        super(account, holder, balance);    // calling the constructor of the super class (Account)
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            //  deposit(amount);
            // balance += amount - 10.0; --> balance is a private, so we don't have access to it when is declared as private
            balance += amount - 10.0;
        }
    }
}
