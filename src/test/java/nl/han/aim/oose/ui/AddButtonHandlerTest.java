package nl.han.aim.oose.ui;

import nl.han.aim.oose.logic.ItemCollector;
import nl.han.aim.oose.logic.RandomItemCreator;
import org.junit.jupiter.api.Test;

import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AddButtonHandlerTest {

    @Test
    void whenButtonIsClickedANewItemIsGeneratedAndAddedToTheTable() {
        ItemView itemView = mock(ItemView.class);
        ItemCollector itemCollector = mock(ItemCollector.class);
        RandomItemCreator randomItemCreator = mock(RandomItemCreator.class);
        when(randomItemCreator.generateItem()).thenReturn("");

        AddButtonHandler addButtonHandler = new AddButtonHandler(itemView, itemCollector, randomItemCreator);
        addButtonHandler.actionPerformed(mock(ActionEvent.class));

        verify(itemCollector).addItem("");
        verify(itemView).bindDataToTable();
        verify(itemView).pack();
    }
}
