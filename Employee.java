package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee id: " + id+" Employee name: " + name+" Employee salary: " + salary);
    }
   
    public static void main(String[] args) {
        
        Employee e1 = new Employee(1, "Sumith", 50000);
        Employee e2 = new Employee(2, "Raju", 60000);
        Employee e3 = new Employee(3, "Rahul", 70000);
        
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        for (Employee e : employees) {
            e.displayDetails();
        }

    }
}
