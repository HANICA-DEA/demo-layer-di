package nl.han.aim.oose.ui;

import nl.han.aim.oose.logic.ItemCollector;
import nl.han.aim.oose.logic.RandomItemCreator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ItemView extends JFrame {
    public static final String FRAME_TITLE = "Items";
    public static final String BUTTON_TITLE = "Add Random Item";
    public static final String COLUMN_NAME = "Item Name";

    private final JPanel panel1 = new JPanel();
    // The table and its model (the data) are so tightly coupled that DI is not relevant here
    private final JTable itemTable = new JTable(new DefaultTableModel(new Object[]{COLUMN_NAME}, 0));
    private final JButton addButton = new JButton();

    private final ItemCollector itemCollector;
    private final RandomItemCreator randomItemCreator;

    public ItemView(ItemCollector itemCollector, RandomItemCreator randomItemCreator) {
        this.itemCollector = itemCollector;
        this.randomItemCreator = randomItemCreator;
    }

    public void showView()
    {
        bindDataToTable();
        initializeButtonBehaviour();
        buildItemViewWithChildComponents();
        showItemView();
    }

    private void showItemView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void buildItemViewWithChildComponents() {
        panel1.setLayout(new FlowLayout());
        panel1.add(itemTable);
        panel1.add(addButton);
        setContentPane(panel1);
        setTitle(FRAME_TITLE);
    }

    private void initializeButtonBehaviour() {
        addButton.setText(BUTTON_TITLE);
        addButton.addActionListener(new AddButtonHandler(this, itemCollector, randomItemCreator));
    }

    public void bindDataToTable() {
        itemTable.setModel(new DefaultTableModel(new Object[]{COLUMN_NAME}, 0));
        for(String item:itemCollector.collectAllItems())
            ((DefaultTableModel)itemTable.getModel()).insertRow(0, new Object[] { item });
    }
}
