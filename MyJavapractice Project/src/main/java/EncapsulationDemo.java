// Class demonstrating Encapsulation
class MathOperations {
    // Private fields (data hiding)
    private int num1;
    private int num2;

    // Constructor
    public MathOperations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getter for num1
    public int getNum1() {
        return num1;
    }

    // Setter for num1
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // Getter for num2
    public int getNum2() {
        return num2;
    }

    // Setter for num2
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Method to perform addition
    public int add() {
        return num1 + num2;
    }

    // Method to perform multiplication
    public int multiply() {
        return num1 * num2;
    }
}

// Main class to test encapsulation
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating an object of MathOperations
        MathOperations math = new MathOperations(10, 5);

        // Accessing values through getters
        System.out.println("Number 1: " + math.getNum1());
        System.out.println("Number 2: " + math.getNum2());

        // Performing operations
        System.out.println("Addition: " + math.add());
        System.out.println("Multiplication: " + math.multiply());

        // Modifying values using setters
        math.setNum1(8);
        math.setNum2(3);

        // Performing operations after modification
        System.out.println("After Modification:");
        System.out.println("Number 1: " + math.getNum1());
        System.out.println("Number 2: " + math.getNum2());
        System.out.println("Addition: " + math.add());
        System.out.println("Multiplication: " + math.multiply());
    }
}
