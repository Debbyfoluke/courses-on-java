package java_course_part3.collections;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{

        private T[] items = (T[]) new Object[10];
        private int count;
        public void add(T item) {
            items[count++] = item;
        }
        public T get(int index) {
            return items[index];
        }


    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }
    private class ListIterator implements Iterator<T> {
            private int index;
            private GenericList<T> list;
public ListIterator(GenericList<T> list) {
    this.list = list;
}
        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
