public class Constructor {

    public Constructor(){
        System.out.println("This is default constructor");
        System.out.println("It doesn't return any value");
        System.out.println("It has same name as class");
        System.out.println("It is executed when ever this class is instantiated or an object is created for this class");


    }

    public Constructor(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Constructor con = new Constructor();
        Constructor str = new Constructor("Its a string type parameterized constructor");

    }
}
