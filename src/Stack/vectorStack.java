package Stack;

import java.util.Vector;

public class vectorStack<T> extends abstractStack<T> {

    private Vector<T> vector = new Vector<>();

    @Override
    public void push(T valor) {
        vector.add(valor);
        size++;
    }

    @Override
    public T pop() {
        if (empty()) return null;
        size--;
        return vector.remove(vector.size() - 1);
    }

    @Override
    public T peek() {
        if (empty()) return null;
        return vector.get(vector.size() - 1);
    }
}