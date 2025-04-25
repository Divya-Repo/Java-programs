public class LargestNumInArray {
    public static void main(String[] args) {
        int[] arr = {25,34,67,90,21};

       int max = arr[0];

       for (int i=1;i < arr.length-1;i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println("Largest Number : "+max);
    }
}
