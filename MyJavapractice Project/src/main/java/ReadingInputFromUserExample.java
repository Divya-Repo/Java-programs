import java.util.Scanner;

public class ReadingInputFromUserExample {

    public static void main(String []args){

         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name:  ");
        String name = scanner.nextLine();

        System.out.println("Enter Your Age:  ");
        int age = scanner.nextInt();

        System.out.println("Enter Your Gender F/M:  ");
         char gender = scanner.next().charAt(0);

        System.out.println("Enter Your Contact Number:  ");
        float contact = scanner.nextFloat();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Contact: "+contact);

    }
}
