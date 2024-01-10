package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListCreation {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Suraj");
        linkedList.add("Kumar");
        linkedList.add("Jha");
        linkedList.add("Java");
        linkedList.add("Developer");

        linkedList.addFirst("SDE-");
        linkedList.addLast("Noida");

        ListIterator listIterator = linkedList.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

}
