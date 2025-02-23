/*
Create a parent class BankAccount with a method getInterestRate().
Then, create two child classes SavingsAccount
 and CurrentAccount, which override getInterestRate() with different interest
 */
// Parent Class
class MyBankAccount {
    public double getInterestRate() {
        return 0.0;
    }
    // Child Class
}
    class SavingsAccount extends MyBankAccount {
        @Override
        public double getInterestRate() {
            return 2.1;
        }
    }

     class CurrentAccount extends MyBankAccount{
        @Override
            public double getInterestRate(){
                return 4.2;
            }
     }



public class PolyOverride {
    public static void main(String[] args) {

        MyBankAccount ac1 = new SavingsAccount();
        System.out.println("Savings Bank new Interest" +ac1.getInterestRate());
        MyBankAccount ac2 = new CurrentAccount();
        System.out.println("Current Bank Account interest: " + ac2.getInterestRate());

    }
}
