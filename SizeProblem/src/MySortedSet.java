import java.util.Iterator;
import java.util.NoSuchElementException;

public class MySortedSet<E extends Comparable<E>> extends MyAbstractSortedSet<E> {

    Node<E> head;
    Node<E> cur;
    int size;

    public MySortedSet() { }

    @Override
    public boolean add(E e) {

        if (head == null) {
            head = new Node<>(e, null);
            size++;
            return true;
        }
        return true;
    }


    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        //size++;
        System.out.println(System.currentTimeMillis());
        return size;
    }

}