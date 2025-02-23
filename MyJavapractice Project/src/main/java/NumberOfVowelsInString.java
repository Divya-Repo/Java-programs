import java.util.Scanner;

public class NumberOfVowelsInString {
   // Count the Number of Vowels in a String
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the string");

       String str = scanner.nextLine();
       int count =0;
       for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'){
                count++;
            }
       }
       System.out.println("Number of vowels: " +count);
   }
}
