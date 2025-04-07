package com.bridgelabz.BasicProblems;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountRows {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Acer\\Desktop\\bridgelabz.workspace\\java-csv\\src\\main\\java\\com\\bridgelabz\\BasicProblems\\employee.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int i = 0;
            while(reader.readLine() != null) {
                i++;
            }
            System.out.println("Total records in the file: " + (i-1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
