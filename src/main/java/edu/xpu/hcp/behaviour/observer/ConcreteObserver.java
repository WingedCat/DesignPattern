package edu.xpu.hcp.behaviour.observer;

/**
 * 具体观察者角色
 */
public class ConcreteObserver implements Observer {
    @Override
    public void Update(Object obj) {
        System.out.println("Received:"+obj);
    }
}
