import java.util.Arrays;

public class SimpleStringExercise {

   static  int a = 7;

   public String method(){

       String  abc = "I am learning JAVA Programming";
        return(abc);
   }

    public static void main(String[] args) {

        System.out.println(a);

        String x = "I am inside main"; // String Literal

        System.out.println(x);
        // Instance of the class creating an object to use class method
        SimpleStringExercise m = new SimpleStringExercise();

        String abc = m.method();

        System.out.println(abc);

        char ch = abc.charAt(6);

        System.out.println("Char at 6 th index: "+ch);
        System.out.println(abc.indexOf("P"));


        String k = abc.replace(" ","");
        char[] charArray = k.toCharArray();
        System.out.print("Print as char array: " + Arrays.toString(charArray));


        String my = abc.concat(" - Divya");
        System.out.println();
        System.out.println("Concated: " + my);

        System.out.println("Length: " + abc.length());
        System.out.println("SubString: " + abc.substring(7,9));

        System.out.println("uppercase: " +k.toUpperCase());

        System.out.println("lowercase: " +k.toLowerCase());


        String[] arr = abc.split(" ");
        for(int i = 0; i< arr.length;i++) {

            System.out.println(arr[i]);
        }

        String reverse = new StringBuilder(abc).reverse().toString();

        System.out.println("Reversed String: " +reverse);

    }
}
