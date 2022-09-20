package nl.han.aim.oose.logic;

import nl.han.aim.oose.datasource.InMemoryDataSource;

public class ItemCollector {
    private InMemoryDataSource inMemoryDataSource;

    public ItemCollector(InMemoryDataSource inMemoryDataSource) {
        this.inMemoryDataSource = inMemoryDataSource;
    }

    public String[] collectAllItems() {
        return inMemoryDataSource.getItems();
    }

    public void addItem(String generatedItem) {
        inMemoryDataSource.addItem(generatedItem);
    }
}
