public class inheritanceExample {

    // static variable
    static int staticvar = 100;

    // instance variable

    int instancevar = 200;

    //static block for inheritanceExample
    static {
        System.out.println("This is a static Block for the class inheritanceExample");
    }

    // instant block for the inheritanceExample
    {
        System.out.println("This is an instance block");
    }

    // Constructor for inheritanceExample
    public inheritanceExample(){

        System.out.println("This is a inheritanceExample Constructor");
    }

    public static void main(String[] args) {

        System.out.println("Main method starts");

        Child childObj = new Child();

        childObj.parentMethod();
        childObj.childMethod();
    }


}
