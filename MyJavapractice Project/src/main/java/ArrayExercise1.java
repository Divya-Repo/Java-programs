public class ArrayExercise1 {
    public static void main(String[] args){

        int[] arr = {5,9,7,6};

        int min = arr[0], max = arr[0];
        for(int i=1;i< arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];

            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
