package nl.han.aim.oose.datasource;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDataSource {
    private List<String> items = new ArrayList<>();

    public InMemoryDataSource() {
        items.add("Boter");
        items.add("Kaas");
        items.add("Eieren");
    }

    public String[] getItems() {
        String[] itemArray = new String[items.size()];
        return items.toArray(itemArray);
    }

    public void addItem(String item) {
        items.add(item);
    }
}
