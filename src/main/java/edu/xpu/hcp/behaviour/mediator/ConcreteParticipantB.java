package edu.xpu.hcp.behaviour.mediator;

public class ConcreteParticipantB extends Participant {
    public ConcreteParticipantB(String name){
        super(name);
    }

    @Override
    public void Receive(String from,String msg){
        System.out.println(super.getName()+" Receive");
        super.Receive(from,msg);
    }
}
