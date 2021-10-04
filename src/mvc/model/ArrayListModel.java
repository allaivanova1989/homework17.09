package mvc.model;

import java.util.ArrayList;

public class ArrayListModel implements Model{
    private ArrayList<String> storage = new ArrayList<>();

    @Override
    public void putData(String data) {
        storage.add(data);
    }

    @Override
    public String getData() {
        return storage.get(storage.size()-1);
    }
}
