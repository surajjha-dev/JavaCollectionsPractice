package Map;

import java.util.*;

public class HashMapCreation {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();

        map.put(1, "Suraj");
        map.put("Suraj", 1);
        map.put(2, "Vikas");
        map.put(3, "Sanjay");
        map.put(4, "Sumit");

        System.out.println(map);

        Set set = map.keySet();

        System.out.println(set);

    /*  set.removeAll(map.keySet()) ;
        System.out.println("Changes on the Key Set is also get reflected on the Map : ");
        System.out.println(map); */

        Collection collection = map.values();
        System.out.println(collection);

        Iterator iterator = map.entrySet().iterator();

        System.out.println("Iterating through Iterator");

        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();

            // Updating the map value through Iterator
            if (entry.getKey().equals("Suraj"))
                entry.setValue(32);

            System.out.println(entry);
        }



    }
}
