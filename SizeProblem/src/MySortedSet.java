import java.util.Iterator;
import java.util.NoSuchElementException;

public class MySortedSet<E extends Comparable<E>> extends MyAbstractSortedSet<E> {

    Node<E> head;
    Node<E> cur;
    int size;

    public MySortedSet() {
        //size = 0;
    }

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
//        cur = head;
//        Integer el = (Integer)o;
//
//
//        while (cur != null) {
//            if (el.compareTo((Integer)cur.item) == 0){
//                return true;
//            }
//            cur = cur.next;
//        }

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
//        Iterator<E> it = new Iterator<E>() {
//            Node<E> cur = head;
//
//            @Override
//            public boolean hasNext() {
//                return cur != null;// ? true : false;
//            }
//
//            @Override
//            public E next() {
//                if (!hasNext()) {
//                    throw new NoSuchElementException();
//                }
//                E item = cur.item;
//                cur = cur.next;
//                return item;
//            }
//        };
        return null;
    }

    @Override
    public int size() {
        //size++;
        System.out.println(System.currentTimeMillis());
        return size;
    }

}