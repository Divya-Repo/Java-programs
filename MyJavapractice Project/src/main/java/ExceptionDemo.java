public class ExceptionDemo {

    public static void main(String[] args) {

        int a=15, b=5;

        try{
          int k=a/b;
           // int arr[] = new int[5];
         //   System.out.println(arr[7]);
            System.out.println(k);
        }

        catch(ArithmeticException ea){
            System.out.println("Arithmetic Error");
        }
        catch(IndexOutOfBoundsException aex){
            System.out.println("Array out of bound");
        }
        catch (Exception e) {

            System.out.println("Generic error");
        }
        finally{
            System.out.println("Close all finally block");
        }
    }
}
