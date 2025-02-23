class BankDetail {
    private String accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankDetail(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;

    }

    public double calculateInterest() {
        return 0.0;
    }
}
    class SavingsAccounts extends BankDetail{
       private final double interestRate = 0.04;

       public SavingsAccounts(double balance, String accountNumber){
           super(balance, accountNumber);
       }
        @Override
        public double calculateInterest(){
           return interestRate * getBalance();
        }

    }

    class CurrentAccounts extends BankDetail{
        private final double interestRate = 0.01;
        public CurrentAccounts(double balance, String accountNumber) {
            super(balance,accountNumber);
        }

        @Override
        public double calculateInterest() {
            return getBalance() * interestRate;
        }
    }


public class TestOOPS {
    public static void main(String[] args) {

        SavingsAccounts savings = new SavingsAccounts(5000,"A5567");
        CurrentAccounts current = new CurrentAccounts(2000,"S677788");

        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Current Account Interest: " + current.calculateInterest());
    }
}
