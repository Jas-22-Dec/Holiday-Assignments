package com.holidayassignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
    List<Employee2> employeeDb = new ArrayList<>();

    public boolean addEmployee(Employee2 e) {
        return employeeDb.add(e);
    }

    public boolean deleteEmployee(int empId) {
        boolean isRemoved = false;

        Iterator<Employee2> it = employeeDb.iterator();

        while (it.hasNext()) {
            Employee2 emp = it.next();
            if (emp.getEmpId() == empId) {
                isRemoved = true;
                it.remove();
            }
        }

        return isRemoved;
    }

    public String showPaySlip(int empId) {
        String paySlip = "Invalid employee id";

        for (Employee2 e : employeeDb) {
            if (e.getEmpId() == empId) {
                paySlip = "Pay slip for employee id " + empId + " is " +
                        e.getEmpSalary();
            }
        }

        return paySlip;
    }

    public Employee2[] listAll() {
        Employee2[] empArray = new Employee2[employeeDb.size()];
        for (int i = 0; i < employeeDb.size(); i++)
            empArray[i] = employeeDb.get(i);
        return empArray;
    }
}
