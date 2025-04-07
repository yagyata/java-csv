package com.bridgelabz.IntermediateProblems;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Acer\\Desktop\\bridgelabz.workspace\\java-csv\\src\\main\\java\\com\\bridgelabz\\IntermediateProblems\\StudentRecord.csv";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int i=0;
            while((line = reader.readLine()) != null) {
                String[] column = line.split(", ");
                i++;
                if(i>1){
                    if(Integer.parseInt(column[2])>80) {
                        System.out.println("Roll No: " + column[0] + " | Name: " +column[1] + " | Marks: " + column[2]);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
