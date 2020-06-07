package edu.xpu.hcp.behaviour.mediator;

public class Participant {
    private IChatroom room;

    private String name;

    public Participant(String name){
        this.name = name;
    }

    public IChatroom getRoom(){
        return this.room;
    }

    public void setRoom(IChatroom room){
        this.room = room;
    }

    public String getName(){
        return this.name;
    }

    public void Receive(String from,String msg){
        System.out.println("From: "+ from);
        System.out.println("Message: "+ msg);
    }

    public void Send(String to,String msg){
        room.Send(name,to,msg);
    }

}
