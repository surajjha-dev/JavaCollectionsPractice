package Queue;

import java.util.PriorityQueue;

public class PriorityQueueCustomOrdering {
    public static void main(String[] args) {

        PriorityQueue<Student> pg = new PriorityQueue<>(5, new StudentComparator());

        pg.add(new Student("Nandini", 3.2));
        pg.add(new Student("Anmol", 3.6));
        pg.add(new Student("Palak", 4.0));

        System.out.println("Student served in the priority order of there cgpa");

        while(!pg.isEmpty()) {
            System.out.println(pg.poll().getName());
        }


    }
}
