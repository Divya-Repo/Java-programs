public class SearchAChar {

    public static void main(String[] args) {

         String str = "My Java Programming";
         char target = 'a';
         int count = 0;

         for (int i = 0; i < str.length(); i++){

             if (str.charAt(i) == 'a'){
                 count++;

             }
         }

        System.out.println("The char '" + target + "' in the string appears " +count + " times.");



    }
}
