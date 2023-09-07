package ch13generic.book.q2;

public class Container<T> {

    public T i;
    public void set(T p) {
        this.i = p;
    }

    public T get() {
        return i;
    }
}
