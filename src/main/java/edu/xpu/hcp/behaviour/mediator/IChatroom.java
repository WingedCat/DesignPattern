package edu.xpu.hcp.behaviour.mediator;

/**
 * 中介者
 */
public interface IChatroom {
    void Register(Participant participant);

    void Send(String from,String to,String msg);
}
