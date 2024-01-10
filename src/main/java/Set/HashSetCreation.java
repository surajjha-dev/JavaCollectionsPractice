package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetCreation {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(3);
        hashSet.add(7);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(4);

        System.out.println("Hash Set - Unordered :");
        for (Integer integer : hashSet) {
            System.out.print(integer + " ");
        }

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(3);
        linkedHashSet.add(7);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(4);

        System.out.println("\nLinked Hash Set - Ordered :");
        for (Integer integer : linkedHashSet) {
            System.out.print(integer + " ");
        }
    }

}
