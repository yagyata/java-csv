package com.bridgelabz.IntermediateProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchRecord {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Acer\\Desktop\\bridgelabz.workspace\\java-csv\\src\\main\\java\\com\\bridgelabz\\IntermediateProblems\\employees.csv";
        System.out.print("Enter the name of the Employee: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] column = line.split(", ");
                if(column[1].equalsIgnoreCase(name)) {
                    System.out.println("Department: " + column[2] + " | Salary: " + column[3]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
