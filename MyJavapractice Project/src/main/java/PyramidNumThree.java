public class PyramidNumThree {
    public static void main(String[] args) {

        int k = 3;
        for ( int i = 0; i<=4; i++){
            for (int j = 1; j<=i; j++) {

                System.out.print(k);
                System.out.print( "\t");
                k+=3;

            }
            System.out.println(" ");

        }


    }
}
