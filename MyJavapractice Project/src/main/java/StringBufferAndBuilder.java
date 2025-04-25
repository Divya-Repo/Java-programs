public class StringBufferAndBuilder {
    public static void main(String[] args) {

        String a = "Hello";   // String literal  immutable > value is always single and cant change.

        String s = "Hi";

        // String Buffer : Mutable.

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("Sam");
        System.out.println(sb);

        sb.insert(2,"Div");
        System.out.println(sb);

        sb.replace(5,8,"ya-");
        System.out.println(sb);

        System.out.println(sb.reverse());


        //String Builder - not thread safe - Non synchronized, faster

    }
}
