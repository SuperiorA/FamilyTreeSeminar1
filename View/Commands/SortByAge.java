package View.Commands;

import model.Model;
import View.View;

public class SortByAge implements Command {
    private Model model;
    private View view;

    public SortByAge(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void execute() {
        model.sortByAge();
        view.showMessage("Семейное дерево отсортировано по дате рождения.");
    }

    @Override
    public String getDescription() {
        return "Сортировать по дате рождения";
    }
}