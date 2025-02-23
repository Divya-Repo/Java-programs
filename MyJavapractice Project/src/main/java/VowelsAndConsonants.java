import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sentence");

        String str = scanner.nextLine();

        int vowels = 0, consonants = 0;

        for  (int i=0; i < str.length();i++){

            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'){
                vowels++;
            }
            else{
                consonants++;
            }

        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
