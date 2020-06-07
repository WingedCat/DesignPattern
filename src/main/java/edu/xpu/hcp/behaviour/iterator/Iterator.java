package edu.xpu.hcp.behaviour.iterator;

public interface Iterator<E> {
    boolean hasNext();

    E next();

    E first();

    E current();

}
