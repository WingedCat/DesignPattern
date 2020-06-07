package edu.xpu.hcp.behaviour.responsibility;

public class ConcreteHandlerB extends Handler {
    @Override
    public void process(int request) {
        if(request > 10 && request <= 20){
            System.out.println("ConcreteHandlerB process... "+request);
        }else if(handler != null){
            handler.process(request);
        }
    }
}
