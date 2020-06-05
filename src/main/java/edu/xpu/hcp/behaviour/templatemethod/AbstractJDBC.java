package edu.xpu.hcp.behaviour.templatemethod;

public abstract class AbstractJDBC {
    public abstract void connect();
    public abstract void select();
    public abstract void process();
    public abstract void disconect();

    public void run(){
        //规定执行顺序，不可更改
        connect();
        select();
        process();
        disconect();
    }
}
