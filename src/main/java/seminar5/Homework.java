package seminar5;

import seminar5.models.Model;

public class Homework {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter();
        presenter.start();
    }
}
