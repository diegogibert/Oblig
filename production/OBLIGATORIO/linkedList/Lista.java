package uy.edu.um.prog2.tad.linkedList;

public interface Lista<T> {
    public void add(T value);
    public void remove(int position);
    public T get(int position);
    public int size();
}
