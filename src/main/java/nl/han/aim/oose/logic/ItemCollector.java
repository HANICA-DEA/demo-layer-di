package nl.han.aim.oose.logic;

import nl.han.aim.oose.datasource.InMemoryDataSource;

public class ItemCollector {
    private InMemoryDataSource inMemoryDataSource = new InMemoryDataSource();

    public String[] collectAllItems() {
        return inMemoryDataSource.getItems();
    }
}
