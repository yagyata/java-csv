package com.bridgelabz.AdvancedProblems;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.*;

public class DetectDuplicates {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/bridgelabz/AdvancedProblems/duplicate.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();
            String[] line;
            Set<String> uniqueId = new HashSet<>();
            List<String[]> duplicateRecords = new ArrayList<>();
            Set<String> seenDuplicates = new HashSet<>();

            while((line = reader.readNext()) != null) {
               String id = line[0];

               if(!uniqueId.add(id)) {
                   if(seenDuplicates.add(id)) {
                       System.out.println("Duplicate Records for ID: " + id);
                   }
                   System.out.println(Arrays.toString(line));
                   duplicateRecords.add(line);
               }
            }
            if (duplicateRecords.isEmpty()) {
                System.out.println("No duplicate rows found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
