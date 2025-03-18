public class MaxNumInMinNumCol {

    public static void main(String[] args) {

        // Find the min num in whole array

        int [][] arr = {{2,4,1},{0,10,5},{6,8,9}};
        int min = arr[0][0];
        int col = 0, row = 0;

        for(int i = 0;i<arr.length;i++){
            for ( int j= 0; j < arr[i].length; j++){

                if (arr[i][j] < min) {

                    min = arr[i][j];

                    // Identify the column of min num
                    col = j;
                    row = i;
                }
            }

        }
        System.out.println(" Min num in array: " +min);
        System.out.println(" Column num with min num in array: " +col);


        // Find max num in the identified column
        int max = arr[row][col];
        int k = 0;
        while (k < 3 ){
            if ( arr[k][col] >max){

                max = arr[k][col];
            }
            k++;
        }
        System.out.println(" max num is " +max);

    }
}
