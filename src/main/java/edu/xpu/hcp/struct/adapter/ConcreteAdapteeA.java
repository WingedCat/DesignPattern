package edu.xpu.hcp.struct.adapter;

public class ConcreteAdapteeA implements Adaptee {
    @Override
    public void output() {
        System.out.println("From ConcreteAdapteeA");
    }
}
