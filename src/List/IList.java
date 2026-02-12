package List;

public interface IList<T> {
    void add(T element);
    void remove(T element);
    T get(int index);
    int size();
    boolean contains(T element);
}
