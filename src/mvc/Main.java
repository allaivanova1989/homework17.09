package mvc;

import mvc.controller.ConsoleController;
import mvc.controller.Controller;
import mvc.controller.LowerCaseController;
import mvc.model.ArrayListModel;
import mvc.model.Model;
import mvc.model.QueueModel;
import mvc.view.ConsoleView;
import mvc.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new QueueModel();
        Controller controller = new LowerCaseController(model);
        View view = new ConsoleView(model);

        controller.getDataFromUser();
        view.giveDataForUser();
    }
}
