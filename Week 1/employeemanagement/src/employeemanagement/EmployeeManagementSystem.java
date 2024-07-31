package employeemanagement;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size++] = employee;
        } else {
            System.out.println("Employee array is full.");
        }
    }

    // Search Employee by ID
    public Employee searchEmployeeById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    // Traverse Employees
    public void traverseEmployees() {
        if (size == 0) {
            System.out.println("No employees to display.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee by ID
    public void deleteEmployeeById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                // Shift elements to the left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null; // Decrement size and clear the last element
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Add Employees
        ems.addEmployee(new Employee("E001", "Vignesh R", "Developer", 70000));
        ems.addEmployee(new Employee("E002", "Subash", "Manager", 80000));
        ems.addEmployee(new Employee("E003", "Dhanush", "Analyst", 60000));

        // Traverse Employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Search for an Employee
        System.out.println("\nSearching for Employee with ID E002:");
        Employee employee = ems.searchEmployeeById("E002");
        System.out.println(employee != null ? employee : "Employee not found");

        // Delete an Employee
        System.out.println("\nDeleting Employee with ID E002:");
        ems.deleteEmployeeById("E002");

        // Traverse Employees again
        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}

