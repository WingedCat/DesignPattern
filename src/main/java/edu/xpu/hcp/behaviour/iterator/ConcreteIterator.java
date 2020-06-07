package edu.xpu.hcp.behaviour.iterator;

public class ConcreteIterator implements Iterator<Integer> {

    private Aggregate<Integer> aggregate;
    private int currentIndex=0;

    public ConcreteIterator(Aggregate aggregate){
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < aggregate.count();
    }

    @Override
    public Integer next() {
        Integer next = aggregate.index(currentIndex++);
        return next;
    }

    @Override
    public Integer first() {
        return aggregate.index(0);
    }

    @Override
    public Integer current() {
        return aggregate.index(currentIndex);
    }
}
