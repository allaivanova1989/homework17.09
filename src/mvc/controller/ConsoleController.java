package mvc.controller;

import mvc.model.Model;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleController implements Controller{
    private Model model;

    public ConsoleController(Model model) {
        this.model = model;
    }

    @Override
    public void getDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        model.putData(data.toUpperCase());
    }
}
