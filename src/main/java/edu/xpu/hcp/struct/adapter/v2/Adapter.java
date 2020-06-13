package edu.xpu.hcp.struct.adapter.v2;

import edu.xpu.hcp.struct.adapter.Target;

public class Adapter implements Target {
    private  Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee  = adaptee;
    }
    @Override
    public void myOutput() {
        adaptee.output();
    }
}
