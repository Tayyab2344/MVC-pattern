/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tayya
 */
import java.util.List;

public class Student {

    private String name;
    private List<Integer> marks;

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    // Calculate the highest marks
    public int getHighestMarks() {
        return marks.stream().max(Integer::compare).orElse(0);
    }

    // Calculate the minimum marks
    public int getMinimumMarks() {
        return marks.stream().min(Integer::compare).orElse(0);
    }

    // Calculate the average marks
    public double getAverageMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return marks.isEmpty() ? 0 : (double) total / marks.size();
    }

    // Convert average marks to GPA (on a scale of 4.0)
    public double calculateGPA() {
        double averageMarks = getAverageMarks();
        if (averageMarks >= 85) {
            return 4.0;
        }
        if (averageMarks >= 70) {
            return 3.0;
        }
        if (averageMarks >= 55) {
            return 2.0;
        }
        if (averageMarks >= 40) {
            return 1.0;
        }
        return 0.0; // Fail
    }
}
