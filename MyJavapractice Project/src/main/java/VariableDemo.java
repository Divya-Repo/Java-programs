public class VariableDemo {
    // static variable : Shared across all the instances of the class

    static String staticVariable = "I am a Static Variable";

    // instance variable: Unique to each instance of the object of the class

    String instanceVariable = "I am an Instance variable";

    // Method to demonstrate local variable

    public void display() {

        // Local Variable: Declared and used inside the method

        String localVariable = "I am a local variable";

        System.out.println(localVariable);
        System.out.println(instanceVariable);
        System.out.println(staticVariable);
    }
    public static void main(String[] args) {

        // Creating an instance of the class

        VariableDemo demo = new VariableDemo();

        // Calling the method to display

        demo.display();

        // Static variables can be accessed without creating an instance of the object

        System.out.println("Accessing variable without creating an instance:" +VariableDemo.staticVariable);

    }
}
