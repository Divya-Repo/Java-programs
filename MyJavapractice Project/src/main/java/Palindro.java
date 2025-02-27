import java.util.Scanner;

public class Palindro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String input = scanner.nextLine();
        char ch;
        String revstr = "";

        for (int i=0; i < input.length(); i++){
            ch = input.charAt(i);
            revstr = ch + revstr;
        }

        System.out.println("original String : " + input);
        System.out.println("reverse String : " + revstr);

        if (input.equals( revstr)){
            System.out.println("Palindrome");
        }else
            System.out.println("Not a Palindrome");
    }
}
