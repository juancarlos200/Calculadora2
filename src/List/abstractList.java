package List;

public abstract class abstractList<T> implements Lista<T> {

    protected int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Los siguientes métodos se dejan abstractos
    @Override
    public abstract void add(T valor);

    @Override
    public abstract void add(int index, T valor);

    @Override
    public abstract T get(int index);

    @Override
    public abstract T remove(int index);
}