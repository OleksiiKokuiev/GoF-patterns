package main.java.gof.pattern.behavioral.iterator;

public class IteratorExample {

    public static void main(String[] args) {
        Item[] items = new Item[3];
        items[0] = new Item("Item 1");
        items[1] = new Item("Item 2");
        items[2] = new Item("Item 3");

        ItemIterator iterator = new ItemIterator(items);

        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item.getName());
        }
    }
}
