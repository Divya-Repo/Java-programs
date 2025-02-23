// Write a Calculator class with methods to:

//Add two numbers.
//Subtract two numbers.
//Create an instance of Calculator in the main method and
// use it to perform addition and subtraction.

public class Calculator {

    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        int c = a-b;
        return c;
    }

    public static void main(String[] args) {

        Calculator cal = new Calculator();
            int sum = cal.add(10,5);

            int diff = cal.sub(100,25);

        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);



    }
}
