package List;

import java.util.LinkedList;

public class doublylinkedlist<T> extends abstractList<T> {

    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void add(T valor) {
        list.add(valor);
        size++;
    }

    @Override
    public void add(int index, T valor) {
        list.add(index, valor);
        size++;
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public T remove(int index) {
        size--;
        return list.remove(index);
    }
}