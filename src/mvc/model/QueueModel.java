package mvc.model;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueModel implements Model{
    private Queue<String> storage = new ArrayDeque<>();

    @Override
    public void putData(String data) {
        storage.add(data);
    }

    @Override
    public String getData() {
        return storage.poll();
    }
}
