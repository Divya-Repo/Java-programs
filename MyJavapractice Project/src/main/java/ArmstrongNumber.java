public class ArmstrongNumber {
    public static void main(String[] args){

        int num=153,sum=0,temp,res;

        temp = num;
        while (num > 0){

            res = num % 10; //3
            num = num /10; //15

            sum = sum + (res*res*res);



        }

    }
}
