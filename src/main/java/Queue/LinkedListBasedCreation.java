package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListBasedCreation {
    public static void main(String[] args) {
        Queue<String> nameQueue = new LinkedList<>();

        nameQueue.add("Suraj");
        nameQueue.add("Aman");
        nameQueue.add("Sumit");
        nameQueue.add("Rahul");
        nameQueue.add("Nakul");
        nameQueue.offer("RS");

        System.out.println(nameQueue);

        System.out.println("Peek of the Queue : " + nameQueue.peek());

        System.out.println("Removing head of the Queue : " + nameQueue.remove());

        System.out.println(nameQueue);
    }
}
