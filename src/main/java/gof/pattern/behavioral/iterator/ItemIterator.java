package main.java.gof.pattern.behavioral.iterator;

class ItemIterator implements MyIterator {

    private Item[] items;
    private int position = 0;

    public ItemIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Item next() {
        return items[position++];
    }
}
