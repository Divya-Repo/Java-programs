import java.util.Scanner;

public class FindFactorialMethod {

    public static int fact(int num){
    int res =1;
    for ( int i=1; i<=num; i++)
    {
        res = res*i;
    }
        return res;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num");
        System.out.println(fact(scanner.nextInt()));
    }
}
