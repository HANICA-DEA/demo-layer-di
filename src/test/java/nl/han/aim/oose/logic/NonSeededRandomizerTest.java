package nl.han.aim.oose.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonSeededRandomizerTest {

    private static final int MAX_LENGTH = 1;

    @Test
    void whenNextIntCalledItReturnsAnInBetweenZeroAndMaxLength() {
        // Arrange
        NonSeededRandomizer nonSeededRandomizer = new NonSeededRandomizer();

        // Act
        int nextInt = nonSeededRandomizer.nextInt(MAX_LENGTH);

        assertTrue(nextInt >= 0 && nextInt <= MAX_LENGTH);
    }
}
