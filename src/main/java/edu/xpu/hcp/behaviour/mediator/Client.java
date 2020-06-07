package edu.xpu.hcp.behaviour.mediator;

public class Client {
    public static void main(String[] args) {
        IChatroom room = new Chatroom();

        ConcreteParticipantA zhangsan = new ConcreteParticipantA("zhangsan");
        ConcreteParticipantB lisi = new ConcreteParticipantB("lisi");
        room.Register(zhangsan);
        room.Register(lisi);

        zhangsan.Send("lisi","Hello lisi,I am zhangsan");
        lisi.Send("zhangsan","Hello zhangsan,I am lisi,Nice to meet you!");


    }
}
