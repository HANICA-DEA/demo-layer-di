package nl.han.aim.oose;

import nl.han.aim.oose.datasource.InMemoryDataSource;
import nl.han.aim.oose.logic.ItemCollector;
import nl.han.aim.oose.logic.NonSeededRandomizer;
import nl.han.aim.oose.logic.RandomItemCreator;
import nl.han.aim.oose.ui.ItemView;

public class SwingingItemApp {
    /**
     * The main method serves as a "bootstrap" to create all instances and glue everything together using
     * constructor injection (dependency injection). In an enterprise application normally a 'container'
     * is used that serves as a bootstrap for the application. This example shows the disadvantage of not having
     * such a container: the main-function has knowledge of all classes from all layers which
     * breaks the rules for the layer pattern. This is OK (for now), because in an application server
     * like WildFly, the server serves as a container and the responsibility for creating and gluing
     * instances lies outside the application. Because of these reasons no unit test for this SwingingItemApp class
     * is created.
     *
     * @param args String args passed to the VM by the developer or user
     */
    public static void main(String[] args) {
        ItemCollector itemCollector = new ItemCollector(new InMemoryDataSource());
        RandomItemCreator randomItemCreator = new RandomItemCreator(new NonSeededRandomizer());
        ItemView itemView = new ItemView(itemCollector, randomItemCreator);

        itemView.showView();
    }
}
