public class Fibonacci {
    public static void main(String[]args){
        int num1=0, num2=1, num3, num=10;
        for(int i=0;i<=num; i++) {
            num3 = num1 + num2;
            System.out.println(num1 + " ");
            num1 = num2;
            num2 = num3;

        }

    }


}
