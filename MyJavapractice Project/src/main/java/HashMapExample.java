import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(0,"Divya");
        hm.put(1,"Sam");
        hm.put(4,"Ani");

        System.out.println(hm.get(1));

        Set sn = hm.entrySet();

        Iterator it = sn.iterator();

        while ( it.hasNext())
        {
          //  System.out.println(it.next());

            Map.Entry mp = (Map.Entry)it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }
    }
}
