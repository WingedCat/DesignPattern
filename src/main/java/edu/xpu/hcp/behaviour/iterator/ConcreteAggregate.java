package edu.xpu.hcp.behaviour.iterator;

import java.util.ArrayList;

public class ConcreteAggregate extends Aggregate<Integer> {
    private ArrayList<Integer> list = new ArrayList<>();

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
    @Override
    public int count(){
        return list.size();
    }


    @Override
    public void add(Integer ele){
        list.add(ele);
    }
    @Override
    public Integer index(int i){
        return list.get(i);
    }

}
