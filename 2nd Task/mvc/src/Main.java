import model.StudentModel;
import view.StudentView;
import controller.StudentController;

public class Main {
    public static void main(String[] args) {
        // Create a Student model object with sample data
        StudentModel student = new StudentModel(1, "Tayyab", "tayyab@example.com");

        // Create a StudentView object
        StudentView view = new StudentView();

        // Create a StudentController object
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details using the controller
        controller.setStudentName("Ali");
        controller.setStudentEmail("ali@example.com");

        // Display the updated student details
        controller.updateView();
    }
}
