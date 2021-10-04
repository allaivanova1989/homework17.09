package mvc.view;

import mvc.model.Model;

public class ConsoleView implements View{
    private Model model;

    public ConsoleView(Model model) {
        this.model = model;
    }

    @Override
    public void giveDataForUser() {
        String data = model.getData();
        System.out.println(data);
    }
}
