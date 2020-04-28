package edu.upv.poo;

import java.util.ArrayList;

/**
 *
 * @author luisroberto
 */
public class Stack<T> {
    
    private ArrayList<T> items;
    
    public Stack() {
        items = new ArrayList<T>();
    }
    
    public void push(T item) {
        items.add(item);
    }
    
    public T pop() {
        if (isEmpty()) return null;
        return items.remove(items.size() - 1);
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
}
