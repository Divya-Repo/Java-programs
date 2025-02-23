/*Create an Array:

Create a new array called numbers to store 5 numerical values of your choice
(they can be whole numbers or decimals).

Access and Print:

Print the following:

The first element of the numbers array.

The last element of the numbers array.

Reverse Order:

Using a loop, print the elements of the numbers array in reverse order.

Bonus: Element Count:

Calculate the total number of elements within the numbers array.*/
public class Array {
    public static void main(String[] args) {

       int[] numbers = {5,10,15,20,25,67};

        System.out.println("First Number in the array: " + numbers[0]);
        System.out.println("Last number in the array: " + numbers[numbers.length - 1]);

        // Print in reverse order

        for(int i = numbers.length - 1;i >= 0;i--){

                System.out.println(numbers[i]);
        }
        System.out.println("Total number of elements in the array : " + numbers.length);
    }
}
