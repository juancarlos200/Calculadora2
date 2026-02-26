package Stack;

public abstract class abstractStack<T> implements stack<T> {

    protected int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }
}