package nl.han.aim.oose.logic;

import java.util.Random;

public class RandomItemCreator {
    private String[] items = {
            "Rijst", "Aardappels", "Pompoen", "Broccoli", "Soja", "Frikandel"
    };

    public String generateItem() {
        return items[new Random().nextInt(items.length)];
    }
}
