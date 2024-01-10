package Map;

public class Student {

    private int id;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
