package nl.han.aim.oose.ui;

import nl.han.aim.oose.logic.ItemCollector;
import nl.han.aim.oose.logic.RandomItemCreator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonHandler implements ActionListener {
    private ItemView itemView;
    private ItemCollector itemCollector;

    private RandomItemCreator randomItemCreator;
    public AddButtonHandler(ItemView itemView, ItemCollector itemCollector, RandomItemCreator randomItemCreator) {
        this.itemView = itemView;
        this.itemCollector = itemCollector;
        this.randomItemCreator = randomItemCreator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        itemCollector.addItem(randomItemCreator.generateItem());
        itemView.bindDataToTable();
        itemView.pack();
    }
}
