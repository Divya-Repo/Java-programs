import javax.management.StandardEmitterMBean;

public class SwapNumbers {
    public static void main(String[] args) {

        int a=100, b=200 ;
        a=a+b; // 300
        b=a-b; // 100
        a=a-b; // 200
        System.out.println("a="+a +"b="+b);



    }
}

