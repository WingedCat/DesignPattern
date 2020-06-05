package edu.xpu.hcp.behaviour.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConcreteSubject implements Subject {
    //存放所有观察者的引用
    List<Observer> observers = new ArrayList<>();

    @Override
    public void Attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void NotifyObservers() {
        observers.forEach((observer -> observer.Update("hello "+ Math.random())));
    }

    @Override
    public void Invoke(){
        NotifyObservers();
    }
}
