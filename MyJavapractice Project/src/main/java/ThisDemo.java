public class ThisDemo {

    static int a=5;

    public  void getData(){

        int a=7;
        System.out.println(a);
        System.out.println(this.a);

        int b= a + this.a;
        System.out.println(b);
    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.getData();


    }

}
