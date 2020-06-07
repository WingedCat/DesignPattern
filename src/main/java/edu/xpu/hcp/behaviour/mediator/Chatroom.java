package edu.xpu.hcp.behaviour.mediator;

import java.util.HashMap;

public class Chatroom implements IChatroom {
    HashMap<String,Participant> map = new HashMap<>();
    
    @Override
    public void Register(Participant participant) {
        if(!map.containsKey(participant.getName())){
            map.put(participant.getName(),participant);
        }
        participant.setRoom(this);
    }

    @Override
    public void Send(String from, String to, String msg) {
        Participant toPar = map.get(to);
        if(toPar != null){
            toPar.Receive(from,msg);
        }

    }
}
