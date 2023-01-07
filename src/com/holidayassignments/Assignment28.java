package com.holidayassignments;
import java.util.Iterator;
import java.util.Vector;

class Employee1 {
    private int id;
    private String name;
    private String address;
    private Double salary;

    public Employee1(int id, String name, String address, Double salary) {
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

public class Assignment28 {

    public static void main(String[] args) {
        Vector<Employee> list = new Vector<>();

        list.add(new Employee(208, "Anand", "123 street, CA, USA", 100000.0));
        list.add(new Employee(209, "Andrila", "234 street, CA, USA", 200000.0));
        list.add(new Employee(210, "Jasmine", "345 street, CA, USA", 300000.0));
        list.add(new Employee(211, "Alvina", "456 street, CA, USA", 400000.0));

        Iterator<Employee> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());


    }
}
