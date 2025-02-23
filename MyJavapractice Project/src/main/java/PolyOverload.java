class Calculators{
    public int add(int a, int b){

        return a + b;
    }
    public  double add(double a, double b){

        return a + b;
    }
    public int add (int a , int b, int c){

        return a + b + c;
    }
}
public class PolyOverload {
    public static void main(String[] args) {

        Calculators cal = new Calculators();


        System.out.println("Sum of two integers: " + cal.add(2,3));
        System.out.println("Sum of two double: " + cal.add(2.5,3.7));
        System.out.println("Sum of three integers: " + cal.add(2,3, 7));
    }
}
