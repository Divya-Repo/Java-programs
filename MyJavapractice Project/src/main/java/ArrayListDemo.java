import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
            a.add("Divya");
            a.add("Sam");

        System.out.println(a);
        a.add(0,"Ani");
        System.out.println(a);

        a.remove(1);
        System.out.println(a);

        System.out.println(a.get(1));

        System.out.println(a.contains("divya"));


        a.add("Div");
        System.out.println(a.indexOf("Div"));
        System.out.println(a.isEmpty());
        System.out.println(a.indexOf("Div"));
        System.out.println(a.size());




    }
}
