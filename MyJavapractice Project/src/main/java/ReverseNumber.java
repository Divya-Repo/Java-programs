public class ReverseNumber {
    public static void main(String[] args) {

       int num = 12345, rev = 0, temp, rem;
       temp = num;
       while (num > 0){
           rem = num % 10;
           rev = (rev * 10) + rem;
           num = num / 10;
       }

       System.out.println("Reverse Num: " + rev);
       if (rev == temp){
           System.out.println("Palindrome");
           }else{
               System.out.println("Not Palindrome");
           }
       }
    }

