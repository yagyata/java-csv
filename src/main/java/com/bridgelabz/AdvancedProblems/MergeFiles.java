package com.bridgelabz.AdvancedProblems;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class MergeFiles {
    public static void main(String[] args) {
        String file1 = "src/main/java/com/bridgelabz/AdvancedProblems/student1.csv";
        String file2 = "src/main/java/com/bridgelabz/AdvancedProblems/student2.csv";
        String mergedFile = "src/main/java/com/bridgelabz/AdvancedProblems/merged_file.csv";

        try (CSVReader reader1 = new CSVReader(new FileReader(file1));
             CSVReader reader2 = new CSVReader(new FileReader(file2));
             CSVWriter writer = new CSVWriter(new FileWriter(mergedFile))
        ) {
            reader1.readNext();
            reader2.readNext();

            Map<String, String[]> student2Data = new HashMap<>();
            String[] line;
            while((line = reader2.readNext()) != null) {
                if (line.length >= 3) {
                    student2Data.put(line[0], new String[]{line[1], line[2]});
                }
            }

            String[] mergedHeader = {"ID", "Name", "Age", "Marks", "Grade"};
            writer.writeNext(mergedHeader);

            while((line = reader1.readNext()) != null) {
                if (line.length >= 3) {
                    String id = line[0];
                    String[] student1Data = {line[0], line[1], line[2]};
                    String[] student2Info = student2Data.get(id);

                    if (student2Info != null) {
                        String[] merged = {student1Data[0], student1Data[1], student1Data[2], student2Info[0], student2Info[1]};
                        writer.writeNext(merged);
                    }
                }
            }
            System.out.println("Merged student1.csv and student2.csv into merged_students.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}