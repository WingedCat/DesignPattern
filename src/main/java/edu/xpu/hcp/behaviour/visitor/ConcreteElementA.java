package edu.xpu.hcp.behaviour.visitor;

public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
