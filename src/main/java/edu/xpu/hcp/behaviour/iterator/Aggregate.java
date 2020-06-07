package edu.xpu.hcp.behaviour.iterator;

public abstract class Aggregate<E> {
    public abstract Iterator iterator();

    public abstract void add(E ele);

    public abstract int count();

    public abstract E index(int i);


}
