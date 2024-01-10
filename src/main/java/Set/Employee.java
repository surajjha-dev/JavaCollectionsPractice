package Set;

public class Employee implements Comparable {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        int eId1 = this.id;
        Employee employee = (Employee) o;
        int eId2 = employee.id;

        if (eId1 < eId2)
            return -1;
        else if (eId1 > eId2)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
