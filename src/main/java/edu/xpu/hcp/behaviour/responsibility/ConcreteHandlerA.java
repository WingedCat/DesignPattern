package edu.xpu.hcp.behaviour.responsibility;

public class ConcreteHandlerA extends Handler {
    @Override
    public void process(int request) {
        if(request >= 0 && request <= 10){
            System.out.println("ConcreteHandlerA process... "+request);
        }else if(handler != null){
            handler.process(request);
        }
    }
}
