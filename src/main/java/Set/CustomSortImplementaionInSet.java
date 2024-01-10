package Set;

import java.util.Set;
import java.util.TreeSet;

public class CustomSortImplementaionInSet {

    public static void main(String[] args) {

      Employee employee1 = new Employee(1,"Suraj");
      Employee employee2 = new Employee(2, "Sumit");
      Employee employee3 = new Employee(3, "Vikas");
      Employee employee4 = new Employee(4, "Aakash");

      Set<Employee> employeeSet = new TreeSet<>();

      employeeSet.add(employee4);
      employeeSet.add(employee3);
      employeeSet.add(employee1);
      employeeSet.add(employee2);

      System.out.println("Custom Id Based comparator");
      for (Employee employee : employeeSet)
          System.out.println(employee);

      Set<Employee> employeeSet1 = new TreeSet<>(new EmployeeNameComparator());

      employeeSet1.add(employee1);
      employeeSet1.add(employee2);
      employeeSet1.add(employee3);
      employeeSet1.add(employee4);

      System.out.println("Custom Name Based comparator");

      for (Employee employee: employeeSet1)
          System.out.println(employee);

    }

}
