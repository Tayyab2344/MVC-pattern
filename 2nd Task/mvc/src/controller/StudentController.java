package controller;

// Import the correct model and view classes
import model.StudentModel;
import view.StudentView;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    // Constructor
    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Methods to update the model
    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentEmail(String email) {
        model.setEmail(email);
    }

    public String getStudentEmail() {
        return model.getEmail();
    }

    public void setStudentId(int id) {
        model.setId(id);
    }

    public int getStudentId() {
        return model.getId();
    }

    // Method to update the view
    public void updateView() {
        view.displayStudentDetails(model.getId(), model.getName(), model.getEmail());
    }
}
