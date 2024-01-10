package Queue;

public class Student {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + name +
                ", cgpa=" + cgpa +
                '}';
    }
}
