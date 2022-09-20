package nl.han.aim.oose.logic;

import java.util.Random;

public class NonSeededRandomizer implements Randomizer {
    public int nextInt(int length) {
        return new Random().nextInt(length);
    }
}
