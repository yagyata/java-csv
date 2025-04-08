package com.bridgelabz.AdvancedProblems;

import com.opencsv.bean.CsvBindByName;

public class Student {
    @CsvBindByName(column = "Roll no")
    private int ID;

    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Marks")
    private int grade;

    public Student() {}

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", name='" + name + "', grade=" + grade + '}';
    }
}
