package com.holidayassignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 class Employee {
    private int id;
    private String name;
    private String address;
    private Double salary;

    public Employee(int id, String name, String address, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
    }
}

public class Assignment25 {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(208, "Andrila", "123 street, CA, USA", 100000.0));
        list.add(new Employee(209, "Alvina", "234 street, CA, USA", 200000.0));
        list.add(new Employee(210, "Jasmine", "345 street, CA, USA", 300000.0));
        list.add(new Employee(211, "Anand", "456 street, CA, USA", 400000.0));

        Iterator<Employee> it = list.iterator();
        int searchId = 211;
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getId() == searchId)
                System.out.println(emp);
        }
    }

}