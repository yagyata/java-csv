package com.bridgelabz.AdvancedProblems;

import java.io.BufferedReader;
import java.io.FileReader;

public class ValidateCsv {
    public static void main(String[] args) {
        String filePath = "src\\main\\java\\com\\bridgelabz\\AdvancedProblems\\info.csv";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String emailRegex = "^[A-Za-z]+([._%+-]?[A-Za-z\\d]+)*@[a-zA-Z\\d-]+\\.+[a-zA-Z]{2,}$";
            String phoneNoRegex = "^[0-9]{10}$";
            String line = reader.readLine();
            int rowNum = 2;

            while((line = reader.readLine()) != null) {
                String[] column = line.split(",\\s+");
                boolean isValid = true;
                StringBuilder errorMsg = new StringBuilder();

                if (!column[0].matches(emailRegex)) {
                    isValid = false;
                    errorMsg.append("Invalid Email. ");
                }

                if (!column[1].matches(phoneNoRegex)) {
                    isValid = false;
                    errorMsg.append("Invalid Phone Number.");
                }

                if (!isValid) {
                    System.out.println("Row " + rowNum + ": " + line);
                    System.out.println("Error: " + errorMsg.toString());
                    System.out.println();
                }

                rowNum++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
