package com.bridgelabz.AdvancedProblems;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.util.List;

public class CsvDataIntoJavaObjects {
    public static void main(String[] args) {
        String filePath = "src\\main\\java\\com\\bridgelabz\\AdvancedProblems\\studentRecord.csv";
        try {
            FileReader reader = new FileReader(filePath);

            List<Student> students = new CsvToBeanBuilder<Student>(reader)
                    .withType(Student.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    .parse();

            for (Student s : students) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
