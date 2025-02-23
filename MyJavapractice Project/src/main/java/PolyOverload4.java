import java.util.Scanner;

/* Create a class Employee with an overloaded calculateSalary() method that calculates salary based on:

Base salary only.
Base salary + bonus.
Base salary + bonus + deductions. */
class Employee{
    private int days;

    public void setDays(int days){
        this.days = days;
    }
        public int calculateSalary (int salary){
        return (days * salary);

    }
    public int calculateSalary (int salary ,int bonus){
        return days * salary + bonus;

    }
    public int calculateSalary (int salary ,int bonus, int deductions){
        return days * salary + bonus - deductions;

    }

}

public class PolyOverload4 {
    public static void main(String[] args) {
        Employee pay = new Employee();
        System.out.println("Enter the number of days");
        Scanner scanner = new Scanner(System.in);
        int days =  scanner.nextInt();
        pay.setDays(days);
        System.out.println("salary: " + pay.calculateSalary(20));
        System.out.println("salary and bonus: " + pay.calculateSalary(20,100));
        System.out.println("salary bonus and deduction: " + pay.calculateSalary(20,500,100));
    }
}
