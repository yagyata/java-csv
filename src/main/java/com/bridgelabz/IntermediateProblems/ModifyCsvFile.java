package com.bridgelabz.IntermediateProblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ModifyCsvFile {
    public static void main(String[] args) {
        String inputFilePath = "src\\main\\java\\com\\bridgelabz\\IntermediateProblems\\employees.csv";
        String outputFilePath = "src\\main\\java\\com\\bridgelabz\\IntermediateProblems\\updated_employees.csv";

        try(BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] column = line.split(",\\s*");

                if (column[2].equals("IT")) {
                    double salary = Double.parseDouble(column[3]);
                    salary = salary * 1.10;
                    column[3] = String.format("%.0f", salary);
                }
                writer.write(String.join(", ", column));
                writer.newLine();
            }

            System.out.println("Updated CSV file" );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


