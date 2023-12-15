public class Savings_Account{
    static double annualInterestRate;
    private double savingsBalance;
    void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    double getSavingsBalance() {
        return savingsBalance;
    }
    double lateMonthlyInterest()
    {
        return (savingsBalance * annualInterestRate)/12;
    }
     void modifyInterestRate( double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
}