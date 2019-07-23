import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;

public abstract class MyAbstractSortedSet<E> extends AbstractSet<E> {
    protected static class Node<E> implements Comparable<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }

        @Override
        public int compareTo(E o) {
            if (o == null)
                throw new NullPointerException("Item is Null!");
            int o2 = (Integer)o;
            if ((Integer)this.item < o2) {
                return -1;
            } else if ((Integer)this.item > o2) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public abstract boolean add(E e);
    public abstract boolean contains(Object o);
    public abstract boolean remove(Object o);
    public abstract void clear();
    public abstract Iterator<E> iterator();
    //public abstract int size();

}


//add,
