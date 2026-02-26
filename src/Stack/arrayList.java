package Stack;

import java.util.ArrayList;

public class arrayList<T> extends abstractStack<T> {

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void push(T valor) {
        list.add(valor);
        size++;
    }

    @Override
    public T pop() {
        if (empty()) return null;
        size--;
        return list.remove(list.size() - 1);
    }

    @Override
    public T peek() {
        if (empty()) return null;
        return list.get(list.size() - 1);
    }
}