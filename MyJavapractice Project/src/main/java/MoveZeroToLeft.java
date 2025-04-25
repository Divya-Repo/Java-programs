import java.util.Arrays;

public class MoveZeroToLeft {

    public static void main(String[] args) {

        int [] arr = {0,4,5,0,7,0,1};
        int right = arr.length-1;

        for (int i = arr.length-1; i>=0 ;i--) {

            if (arr[i] != 0) {
                int temp = arr[right];
                arr[right] = arr[i] ;
                 arr[i] = temp;
                right--;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
