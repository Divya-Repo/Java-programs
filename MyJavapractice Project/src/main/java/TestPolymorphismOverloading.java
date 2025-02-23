class Calc{

    public int add(int a, int b) {
      return a + b;
    }
    public int add( int a,int b, int c){
        return a + b +c;

    }
    public double add(double a, double b) {
        return a + b;
    }

    public void calc(){
        System.out.println("Sum of two integers: " + add(5,7));
        System.out.println("Sum of three integers: " + add(5,7,2));
        System.out.println("Sum of two doubles: " + add(5.2,7.4));
    }
}

public class TestPolymorphismOverloading {
    public static void main(String[] args) {
        Calc sum = new Calc();
        sum.calc();
    }
}
