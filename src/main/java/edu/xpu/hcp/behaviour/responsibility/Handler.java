package edu.xpu.hcp.behaviour.responsibility;

public abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler){
        this.handler = handler;
    }

    public abstract void process(int request);

}
