public class SmallestNumInArray {
    public static void main(String[] args) {
        int arr[] = {70,56,32,56,12};
        int min = arr[0];

        for(int i=1;i<arr.length; i++){

            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest num in array is : " + min);
    }
}
