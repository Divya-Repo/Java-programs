import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int num, fact = 1;
        System.out.println("Enter the num:");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num +" is " +fact);
    }


}
