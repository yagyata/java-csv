package com.bridgelabz.BasicProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Acer\\Desktop\\bridgelabz.workspace\\java-csv\\src\\main\\java\\com\\bridgelabz\\BasicProblems\\StudentInfo.csv";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] columns = line.split(", ");
                System.out.println(columns[0] + " | " + columns[1] + " | " + columns[2] + " | " + columns[3]);
                System.out.println("-------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
