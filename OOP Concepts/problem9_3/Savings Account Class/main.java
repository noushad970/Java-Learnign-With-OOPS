public class main{
    public static void main(String[] args) {
    Savings_Account saver1= new Savings_Account();
    Savings_Account saver2= new Savings_Account();

    saver1.setSavingsBalance(2000);
    saver2.setSavingsBalance(3000);
    Savings_Account.annualInterestRate=4;
    double saver1MonthlyInterest=saver1.lateMonthlyInterest();
    double saver2MonthlyInterest=saver2.lateMonthlyInterest();
    System.out.println("when interest is "+ saver1.annualInterestRate+"% than monthly interest for saver 1 is "+ saver1MonthlyInterest);
    System.out.println("when interest is "+ saver2.annualInterestRate+"% than monthly interest for saver 2 is "+ saver2MonthlyInterest);
    saver1.modifyInterestRate(5.0);
    saver2.modifyInterestRate(5.0);
    saver1MonthlyInterest=saver1.lateMonthlyInterest();
    saver2MonthlyInterest=saver2.lateMonthlyInterest();
    System.out.println("when interest is "+ saver1.annualInterestRate+"% than monthly interest for saver 1 is "+ saver1MonthlyInterest);
    System.out.println("when interest is "+ saver2.annualInterestRate+"% than monthly interest for saver 2 is "+ saver2MonthlyInterest);
    

    }
}