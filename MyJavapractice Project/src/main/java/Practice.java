import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        int[] arr = {5, 2, 0, 3, 4, 8, 0, 6, 0};
        int n = arr.length - 1;


        // print reverse
       /* for(int i = 0; i<n/2; i++){

            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;

        }
        System.out.println(Arrays.toString(arr));*/

        // move 0 to left

      /*  for (int i=n;i>=0;i--){
            if(arr[i]!=0) {
                int temp = arr[n];
                arr[n] = arr[i];
                arr[i] = temp;
                n--;
            }

        }
        System.out.println(Arrays.toString(arr));


    */
        // Min and Max in an array.

        int min = arr[0], max = arr[0];

        for ( int i =0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max:" +max +"Min: "+min);

    }
}
