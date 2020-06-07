package edu.xpu.hcp.behaviour.mediator;

public class ConcreteParticipantA extends Participant {
    public ConcreteParticipantA(String name){
        super(name);
    }

    @Override
    public void Receive(String from,String msg){
        System.out.println(super.getName()+" Receive");
        super.Receive(from,msg);
    }
}
