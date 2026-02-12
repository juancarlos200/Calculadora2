package List;
public interface Lista<T> {

    void add(T valor);

    void add(int index, T valor);

    T get(int index);

    T remove(int index);

    int size();

    boolean isEmpty();

}