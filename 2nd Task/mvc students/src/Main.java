/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tayya
 */
import controller.StudentController;
import java.util.Arrays;
import java.util.List;
import model.Student;
import view.StudentView;

public class Main {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Tayyab", Arrays.asList(78, 85, 92, 90, 88)),
                new Student("Ali", Arrays.asList(90, 75, 65, 80, 95)),
                new Student("Sara", Arrays.asList(50, 60, 55, 58, 45)),
                new Student("Rehman", Arrays.asList(30, 35, 75, 70, 88))
        );

        StudentView view = new StudentView();

        double totalGPA = 0.0;

        for (Student student : students) {

            StudentController controller = new StudentController(student, view);
            controller.updateStudentDetails();  

            totalGPA += student.calculateGPA();
        }

        double averageGPA = totalGPA / students.size();

        System.out.println("Average GPA of the Class: " + averageGPA);
    }
}
