package seminar5;

import seminar5.models.Model;

import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter(model, view);

        model.createGroup("101");
        model.createGroup("102");
        model.createGroup("103");

        model.createStudent("Student1");
        model.createStudent("Student2");
        model.createStudent("Student3");
        model.createStudent("Student4");

        model.addStudentToGroup(1, "101");
        model.addStudentToGroup(2, "101");
        model.addStudentToGroup(3, "102");
        model.addStudentToGroup(4, "102");

        model.createLesson("101", LocalDate.of(2023, 7, 15));
        model.createLesson("102", LocalDate.of(2023, 7, 14));

        presenter.start();
    }
}
