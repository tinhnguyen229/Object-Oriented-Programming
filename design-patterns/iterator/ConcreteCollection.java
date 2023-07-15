package iterator;

import java.util.ArrayList;

public class ConcreteCollection<E> implements Collection<E> {

    private ArrayList<E> list = new ArrayList<>();

    @Override
    public Iterator<E> getIterator() {
        return new ObjectIterator();
    }

    public void addItem(E item) {
        this.list.add(item);
    }

    class ObjectIterator implements Iterator<E> {
        int index;

        @Override
        public boolean hasNext() {
            return (index < list.size());
        }

        @Override
        public E getNext() {
            return list.get(index++);
        }

        @Override
        public void reset() {
            index = 0;
        }

    }
}
