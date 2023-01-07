package com.holidayassignments;

public class Assignment22 {
    public static void main(String[] args) {
        EmployeeDB empDb = new EmployeeDB();

        Employee2 emp1 = new Employee2(208, "Anand", "andy@gmail.com", 'M', 2000000);
        Employee2 emp2 = new Employee2(209, "Andrila", "andr@gmail.com", 'F', 3000000);
        Employee2 emp3 = new Employee2(210, "Alvina", "alv@gmail.com", 'F', 2000000);
        Employee2 emp4 = new Employee2(211, "Jasmine", "jas@gmail.com", 'F', 5000000);

        empDb.addEmployee(emp1);
        empDb.addEmployee(emp2);
        empDb.addEmployee(emp3);
        empDb.addEmployee(emp4);

        for (Employee2 emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());

        System.out.println();
        empDb.deleteEmployee(210);

        for (Employee2 emp : empDb.listAll())
            System.out.println(emp.GetEmployeeDetails());

        System.out.println();

        System.out.println(empDb.showPaySlip(211));
    }
}
