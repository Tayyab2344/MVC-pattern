/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author tayya
 */
import model.Student;
import view.StudentView;

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateStudentDetails() {
        String name = model.getName();
        int highestMarks = model.getHighestMarks();
        int minimumMarks = model.getMinimumMarks();
        double gpa = model.calculateGPA();
        view.displayStudentDetails(name, highestMarks, minimumMarks, gpa);
    }
}
