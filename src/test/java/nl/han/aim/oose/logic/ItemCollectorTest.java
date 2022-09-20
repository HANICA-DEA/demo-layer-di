package nl.han.aim.oose.logic;

import nl.han.aim.oose.datasource.InMemoryDataSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ItemCollectorTest {

    @Test
    void whenAddItemCalledItAlsoCallsAddItemOnInMemoryDataSource() {
        InMemoryDataSource inMemoryDataSource = mock(InMemoryDataSource.class);
        ItemCollector itemCollector = new ItemCollector(inMemoryDataSource);

        // Act
        itemCollector.addItem("");

        // Assert
        verify(inMemoryDataSource).addItem("");
    }

    @Test
    void whenInMemoryDataSourceHasXItemsItemCollectorAlsoReturnsXItems() {
        InMemoryDataSource inMemoryDataSource = mock(InMemoryDataSource.class);
        ItemCollector itemCollector = new ItemCollector(inMemoryDataSource);
        when(inMemoryDataSource.getItems()).thenReturn(new String[]{});

        String[] allItems = itemCollector.collectAllItems();

        assertEquals(0, allItems.length);
    }
}
