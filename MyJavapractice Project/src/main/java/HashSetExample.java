import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {


        HashSet<String> hs = new HashSet<String>();

        hs.add("USA");
        hs.add("UK");
        hs.add("INDIA");
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
       // System.out.println(hs.remove("USA"));
        System.out.println(hs);

        hs.add("CAN");
        hs.add("IT");

        Iterator<String> i = hs.iterator();
        System.out.println(i.next());
        System.out.println(i.next());
    }
}
