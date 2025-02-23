import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");

        String word = scanner.nextLine();
        String reverse = "";

        for(int i=word.length() -1 ; i>=0; i--){
            reverse+= word.charAt(i);

        }
        if (word.equals(reverse) ) {
            System.out.println("This is a palindrome");
        }
        else{
                System.out.println("This is not a Palindrome");
            }




    }
}
