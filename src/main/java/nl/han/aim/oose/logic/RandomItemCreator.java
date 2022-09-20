package nl.han.aim.oose.logic;

import java.util.Random;

public class RandomItemCreator {

    private String[] items = {
            "Rijst", "Aardappels", "Pompoen", "Broccoli", "Soja", "Frikandel"
    };
    private Randomizer myRandom;

    public RandomItemCreator(Randomizer myRandom) {
        this.myRandom = myRandom;
    }

    public String generateItem() {
        return items[myRandom.nextInt(items.length)];
    }
}
