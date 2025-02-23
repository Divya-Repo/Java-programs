import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        int num,res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scanner.nextInt();
        System.out.println("Entered num =" + num);
        if(num % 2 == 0){
            System.out.println("number is even");}
        else{
                System.out.println("number is odd");
            }
        }
    }

