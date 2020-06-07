package edu.xpu.hcp.behaviour.responsibility;

public class ConcreteHandlerC extends Handler {
    @Override
    public void process(int request) {
        if(request > 20 && request <= 30){
            System.out.println("ConcreteHandlerC process... "+request);
        }else if(handler != null){
            handler.process(request);
        }
    }
}
