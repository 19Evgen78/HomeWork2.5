package pro.sky.java.course2.employeeaccounting.service;

import pro.sky.java.course2.employeeaccounting.mobel.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}
