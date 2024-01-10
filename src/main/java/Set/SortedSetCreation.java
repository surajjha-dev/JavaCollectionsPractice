package Set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetCreation {
    public static void main(String[] args) {


        NavigableSet<Integer> navigableSet = new TreeSet<>();

        navigableSet.add(2);
        navigableSet.add(3);
        navigableSet.add(7);
        navigableSet.add(4);
        navigableSet.add(1);

        System.out.print("Navigable Set");

        System.out.println(navigableSet.first());

        System.out.println(navigableSet.last());

        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(1);
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(3);
        sortedSet.add(4);

        Iterator iterator = sortedSet.iterator();

        System.out.print("Sorted Set : Data order is maintained");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


    }
}
