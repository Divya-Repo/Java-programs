public class ReverseArray {
    public static void main(String[] args) {

      int[] arr = {21,28,63,98,41};
        System.out.println("Original Array: ");
        for (int i=0;i<= arr.length-1;i++){
            System.out.println(arr[i]);
        }

        //Reverse of the array

        System.out.println("Reverse order of the Array: ");
        for (int i=arr.length - 1; i>=0; i--){
            System.out.println(arr[i]);
        }

    }
}
