package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCreation {

    public static void main(String[] args) {

        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("Aman");
        priorityQueue.add("Suraj");
        priorityQueue.add("Rahul");
        priorityQueue.add("Nakul");

        System.out.println("Priority Queue elements are ascending by Default");
        System.out.println(priorityQueue);

        Iterator iterator = priorityQueue.iterator();

        System.out.println("Iterating over the Queue :");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        Queue<Student> studentQueue = new PriorityQueue<>();

        studentQueue.add(new Student(30));
        studentQueue.add(new Student(20));
        studentQueue.add(new Student(10));

        // Priority Queue order based on the Student id.
        System.out.println(studentQueue);

    }
}
