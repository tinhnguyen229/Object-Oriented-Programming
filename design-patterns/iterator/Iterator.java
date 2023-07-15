package iterator;

public interface Iterator<E> {
    boolean hasNext();

    E getNext();

    void reset();
}