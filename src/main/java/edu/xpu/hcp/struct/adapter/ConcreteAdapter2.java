package edu.xpu.hcp.struct.adapter;

public class ConcreteAdapter2 extends ConcreteAdapteeB implements Target{
    @Override
    public void myOutput() {
        System.out.println("From ConcreteAdapter2");
        this.output();//适配
    }

}
