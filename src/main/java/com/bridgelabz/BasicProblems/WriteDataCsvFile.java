package com.bridgelabz.BasicProblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataCsvFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Acer\\Desktop\\bridgelabz.workspace\\java-csv\\src\\main\\java\\com\\bridgelabz\\BasicProblems\\employee.csv";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("ID, Name, Department, Salary\n");
            writer.write("1568, Yagyata, Manager, 100000\n");
            writer.write("2021, Loveleen, Team Leader, 90000\n");
            writer.write("1111, Riya, Developer, 80000\n");
            writer.write("3524, Priya, Developer, 70000\n");
            writer.write("6234, Sia, Developer, 75000\n");
            System.out.println("Data written in CSV file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
