package com.week9Py;


import java.util.ArrayList;
import java.util.Stack;

public class ArrayListStack<E> implements Interface<E> {

    private ArrayList<E> list;

    public ArrayListStack() {
        list = new ArrayList<E>();
    }

    @Override
    public void add(E t) {
        list.add(t);
    }

    @Override
    public void remove(E t) {
        list.remove(t);
    }

    @Override
    public boolean empty() {
        return list.size() == 0;
    }

    @Override
    public int size() {
        return list.size();
    }
}
