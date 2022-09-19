package nl.han.aim.oose.ui;

import nl.han.aim.oose.datasource.InMemoryDataSource;
import nl.han.aim.oose.logic.RandomItemCreator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonHandler implements ActionListener {
    private ItemView itemView;

    private RandomItemCreator randomItemCreator = new RandomItemCreator();
    private InMemoryDataSource inMemoryDataSource = new InMemoryDataSource();

    public AddButtonHandler(ItemView itemView) {
        this.itemView = itemView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inMemoryDataSource.addItem(randomItemCreator.generateItem());
        itemView.bindDataToTable();
        itemView.pack();
    }
}
