import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");

        int numbers = scanner.nextInt();
        int evenCount = 0 , oddCount = 0;

        System.out.println("Enter" +numbers + "numbers");

        for (int i = 0; i < numbers; i++){
            int num  = scanner.nextInt();
            if (num % 2 == 0){
                evenCount++;
                            }
            else {
                oddCount++;
            }


        }
        System.out.println("Total number of even numbers " +evenCount);
        System.out.println("Total number of odd numbers " +oddCount);

        scanner.close();
    }
}
