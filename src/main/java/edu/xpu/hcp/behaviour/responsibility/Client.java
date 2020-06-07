package edu.xpu.hcp.behaviour.responsibility;

public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        //将处理器链接起来
        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);

        for (int i = 0; i < 40; i+=11) {
            handlerA.process(i);
        }
    }
}
