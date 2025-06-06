public class Overload {


    public static class Calcul {

        int add(int a, int b) {
            int sum = a + b;
            return sum;
        }


        double add(double a, double b, double c) {
            double sum = a + b + c;
            return sum;
        }
    }

    public static void main(String[] args) {
        Calcul Obj = new Calcul();
        Obj.add(25, 2);
        Obj.add(25.3, 2.2, 3.4);

    }
}
