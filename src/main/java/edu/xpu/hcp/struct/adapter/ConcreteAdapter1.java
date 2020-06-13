package edu.xpu.hcp.struct.adapter;

public class ConcreteAdapter1 extends ConcreteAdapteeA implements Target{
    @Override
    public void myOutput() {
        System.out.println("From ConcreteAdapter1");
        this.output();//适配
    }
}
