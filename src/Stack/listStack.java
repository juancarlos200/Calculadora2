package Stack;

import List.*;

public class listStack<T> extends abstractStack<T> {

    private Lista<T> lista;

    public listStack(Lista<T> lista) {
        this.lista = lista;
    }

    @Override
    public void push(T valor) {
        lista.add(valor);
        size++;
    }

    @Override
    public T pop() {
        if (empty()) return null;
        size--;
        return lista.remove(lista.size() - 1);
    }

    @Override
    public T peek() {
        if (empty()) return null;
        return lista.get(lista.size() - 1);
    }
}