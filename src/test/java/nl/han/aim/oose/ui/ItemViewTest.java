package nl.han.aim.oose.ui;

import nl.han.aim.oose.logic.ItemCollector;
import nl.han.aim.oose.logic.RandomItemCreator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ItemViewTest {

    @Test
    void whenShowViewCalledTheTableIsPopulatedWithDataFromTheItemCollector() {
        ItemCollector itemCollector = mock(ItemCollector.class);
        RandomItemCreator randomItemCreator = mock(RandomItemCreator.class);
        when(itemCollector.collectAllItems()).thenReturn(new String[] { "",""});
        ItemView itemView = new ItemView(itemCollector, randomItemCreator);
        itemView.showView();

        verify(itemCollector).collectAllItems();
    }
}
