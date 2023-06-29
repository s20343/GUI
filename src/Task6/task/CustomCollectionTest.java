package Task6.task;

import static org.junit.jupiter.api.Assertions.*;
import Task6.task.CustomCollection.CustomIterator;


class CustomCollectionTest {
    private CustomCollection<Integer> collection = new CustomCollection();

    @org.junit.jupiter.api.Test
    void add() {
        int previousSize = collection.getElements().size();
        collection.add(100);
        assertEquals(collection.getElements().size(),previousSize+1);
    }


    @org.junit.jupiter.api.Test
    void listIterator() {
        collection.add(10);
        collection.add(40);
        collection.add(30);
        collection.listIterator();
    }

    @org.junit.jupiter.api.Test
    void remove() {
        collection.add(6);
        collection.add(7);
        int previousSize = collection.getElements().size();
        CustomIterator iterator = collection.getIterator();
        iterator.next();
        iterator.next();
        System.out.println("before remove: ");
        collection.listIterator();
        iterator.remove();
        System.out.println("after remove: ");
        collection.listIterator();
        assertEquals(collection.getElements().size(), previousSize-1);
    }

}