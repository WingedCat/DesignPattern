package edu.xpu.hcp.behaviour.visitor;

public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
