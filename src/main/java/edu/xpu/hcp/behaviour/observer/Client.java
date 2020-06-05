package edu.xpu.hcp.behaviour.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        Observer observer3 = new ConcreteObserver();

        subject.Attach(observer1);
        subject.Attach(observer2);
        subject.Attach(observer3);

        subject.Invoke();
    }
}
