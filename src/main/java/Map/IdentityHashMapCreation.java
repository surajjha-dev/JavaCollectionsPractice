package Map;

import java.lang.ref.Reference;
import java.util.IdentityHashMap;

public class IdentityHashMapCreation {
    public static void main(String[] args) {

        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(10);

        IdentityHashMap identityHashMap = new IdentityHashMap();

        identityHashMap.put(integer1, "Suraj");
        identityHashMap.put(integer2, "Vikas");

        System.out.println("Keys and compared on the basis of their Reference not equals method");
        System.out.println(identityHashMap);

    }
}
