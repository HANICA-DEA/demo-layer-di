package nl.han.aim.oose.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RandomItemCreatorTest {

    @Test
    void whenGenerateItemCalledItReturnsAnItemDFromAFixedIndex_mock() {
        // Uses a mock for arrange
        Randomizer mockRandomizer = mock(Randomizer.class);
        when(mockRandomizer.nextInt(6)).thenReturn(0);
        RandomItemCreator randomItemCreator = new RandomItemCreator(mockRandomizer);

        // Act
        String generatedItem = randomItemCreator.generateItem();

        // Assert
        assertEquals("Rijst", generatedItem);
    }

    @Test
    void whenGenerateItemCalledItReturnsAnItemDFromAFixedIndex_stub() {
        // Uses a stub for arrange
        RandomItemCreator randomItemCreator = new RandomItemCreator(new MyTestRandomizer());

        // Act
        String generatedItem = randomItemCreator.generateItem();

        // Assert
        assertEquals("Rijst", generatedItem);
    }
}
