//Create a BankAccount class with:
//
//accountNumber (String)
//balance (double)
//Add methods:
//deposit(double amount) to increase the balance.
//withdraw(double amount) to decrease the balance (only if the balance is sufficient).
//Test the class by creating an object and performing transactions.

public class BankAccount {

    public String accountNumber;
    public double balance;

    public void deposit(double amount){

        balance += amount;

    }

    public void withdraw(double amount) {
       if (amount <= balance) {

           balance -= amount;

       }
       else
           System.out.println("Insufficient Balance!");
    }

    public void display(){
        System.out.println("Account Number: " +accountNumber);
        System.out.println("Balance: " +balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.accountNumber = "555445";
        account.balance = 500.89;

        account.deposit(1200);
        account.withdraw(330);
       // account.withdraw(800);

        account.display();



    }

}
