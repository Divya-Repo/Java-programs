 class BankAccounts {
     private String accountNumber;
     private String accountHolderName;
     private double balance;

     public BankAccounts(String accountNumber, String accountHolderName, double balance) {
         this.accountNumber = accountNumber;
         this.accountHolderName = accountHolderName;
         this.balance = balance;
     }

     //getters

     public String getAccountNumber() {
         return accountNumber;

     }

     public String getAccountHolderName() {
         return accountHolderName;
     }

     public double getBalance() {
         return balance;
     }

     public void deposit(double amount) {
         if (amount > 0) {
             balance += amount;
             System.out.println("Deposited: " + amount);
         } else {
             System.out.println("Invalid Amount");
         }
     }

     public void withdraw(double amount) {
         if (amount > 0 && amount <= balance) {
             balance -= amount;
             System.out.println("Withdrawn: " + amount);
         } else {
             System.out.println("Insufficient Balance ");
         }
     }
 }


    public class BankDemo{
    public static void main(String[] args){
       BankAccounts account = new BankAccounts("A23344","Divya", 670.87);

       System.out.println("Account Holder: " +account.getAccountHolderName());
            System.out.println("Balance: $" +account.getBalance());

            account.deposit(500);
            System.out.println("Updated Balance: " +account.getBalance());

            account.withdraw(200);
            System.out.println("Updated Balance: $" + account.getBalance());
    }


}
