package com.bridgelabz.IntermediateProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String id;
    String name;
    String department;
    Double salary;
    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
public class SortCsvRecords {
    public static void main(String[] args) {
        String inputFilePath = "src\\main\\java\\com\\bridgelabz\\IntermediateProblems\\employees.csv";
        List<Employee> employees = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line = reader.readLine();
            while((line = reader.readLine()) != null) {
                String[] column = line.split(",\\s*");
                if(column.length == 4) {
                    String id = column[0];
                    String name = column[1];
                    String department = column[2];
                    double salary = Double.parseDouble(column[3]);
                    employees.add(new Employee(id, name, department, salary));
                }
            }
            Collections.sort(employees, Comparator.comparingDouble(emp -> -emp.salary));

            System.out.println("Top 5 highest-paid employees:");
            for (int i = 0; i < 5; i++) {
                Employee emp = employees.get(i);
                System.out.println(emp.id + ", " + emp.name + ", " + emp.department + ", " + emp.salary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
