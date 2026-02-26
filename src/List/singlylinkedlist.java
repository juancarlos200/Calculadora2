package List;

import java.util.ArrayList;

public class singlylinkedlist<T> extends abstractList<T> {

    private ArrayList<T> list = new ArrayList<>();

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