package edu.xpu.hcp.behaviour.templatemethod;

public class ConcreteJDBC extends AbstractJDBC {
    @Override
    public void connect() {
        System.out.println("connect ...");
    }

    @Override
    public void select() {
        System.out.println("select ...");
    }

    @Override
    public void process() {
        System.out.println("process ...");
    }

    @Override
    public void disconect() {
        System.out.println("disconnect ...");
    }
}
