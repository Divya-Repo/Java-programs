/*
Write a Java class MathOperations that has an overloaded multiply() method to:

Multiply two integers.
Multiply three integers.
Multiply two double values.
 */

class MathOperation{

    public int multiply(int a, int b){
        return a *b;
    }

    public int multiply(int a, int b, int c){
        return a * b * c;
    }

    public double multiply(double a, double b){
        return a * b;
    }

}
public class PolyOverload3 {
    public static void main(String[] args) {

        MathOperation math = new MathOperation();
        System.out.println("Product of two Integers: "+ math.multiply(5, 4));
        System.out.println("Product of three Integers: "+ math.multiply(25, 4,2));
        System.out.println("Product of two fractions: "+ math.multiply(5.3, 4.2));

    }
}
