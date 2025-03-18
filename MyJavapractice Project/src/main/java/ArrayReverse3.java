public class ArrayReverse3 {
    public static void main(String[] args) {



    int []arr = {3,4,9,1};
    int n = arr.length;

    for ( int i =0 ; i < n/2 ; i++){

        int temp = arr[i];
        arr[i] = arr[n-1-i];
        arr[n-1-i] = temp;

            }

        System.out.println("Reversed Array:");

    for ( int i = 0; i<n;i++){

        System.out.println(arr[i]);
    }

}
}
