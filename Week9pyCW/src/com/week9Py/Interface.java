package com.week9Py;

import javax.lang.model.element.Element;

public interface Interface<E> {

    public void add(E t);

    public void remove(E t);

    public boolean empty();

    public int size();
}
