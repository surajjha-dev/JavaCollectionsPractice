package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapCreation {
    public static void main(String[] args) {

        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        sortedMap.put(400, "Nakul");
        sortedMap.put(300, "Obama");
        sortedMap.put(200, "Sharon");
        sortedMap.put(100, "Suraj");

        System.out.println(sortedMap);


    }
}
