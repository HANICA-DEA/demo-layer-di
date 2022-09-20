package nl.han.aim.oose.datasource;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InMemoryDataSourceTest {
    @Test
    public void whenGetItemsCalledItReturnsThreeItems() {
        // Arrange
        InMemoryDataSource inMemoryDataSource = new InMemoryDataSource();

        // Act
        String[] items = inMemoryDataSource.getItems();

        // Assert
        assertEquals(3, items.length);
    }

    @Test
    public void whenItemAddedToNewDataSourceItShouldContainFourItems()
    {
        InMemoryDataSource inMemoryDataSource = new InMemoryDataSource();

        inMemoryDataSource.addItem("");

        assertEquals(4, inMemoryDataSource.getItems().length);
    }
}
