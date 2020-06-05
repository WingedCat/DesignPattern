package edu.xpu.hcp.behaviour.observer;

public interface Subject {
    void Attach(Observer observer);
    void Detach(Observer observer);
    void NotifyObservers();
    void Invoke();
}
