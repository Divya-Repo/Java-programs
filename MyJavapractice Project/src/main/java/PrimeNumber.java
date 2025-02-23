import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        if (num <= 1){
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = false;
        for ( int i=2;i <= Math.sqrt(num) ; i++){
            if (num % i == 0){
                isPrime = false;
                break;

            }

        }
        if (isPrime){
            System.out.println("Is Prime");
        }else {
            System.out.println("not prime");
        }
    }
}
