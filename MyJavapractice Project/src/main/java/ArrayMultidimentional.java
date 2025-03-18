public class ArrayMultidimentional {

    public static void main(String[] args) {

        int[][] a = {{2,3,4},{5,4,1},{6,8,9}};

       // System.out.println("Array:"+ a[2][1]);

       /* for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){

                System.out.println(a[i][j]);
            }
        }*/

        //Finding Smallest number in an Array

        int min = a[0][0], max = a[0][0];

        for ( int i =0 ; i<a.length;i++){

            for(int j = 0; j<a.length; j++){

                if( a[i][j] < a[0][0]){

                    min = a[i][j];
                }
            }
        }

        System.out.println("min num = " + min);

        // max number in an array

        for (int x=0; x< a.length;x++){
            for(int y=0; y<a.length;y++){

                if(a[x][y] > max){
                    max = a[x][y];

                }
            }
        }
        System.out.println("Max=" +max);

    }
}
