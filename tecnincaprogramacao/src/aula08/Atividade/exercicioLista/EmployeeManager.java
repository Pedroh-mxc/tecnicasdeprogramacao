package Atividade.exercicioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEmployee #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = findEmployeeById(employees, id);

        if (emp != null) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }

    private static Employee findEmployeeById(List<Employee> employees, int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
}
