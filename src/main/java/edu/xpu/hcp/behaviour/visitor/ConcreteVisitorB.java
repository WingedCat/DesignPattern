package edu.xpu.hcp.behaviour.visitor;

public class ConcreteVisitorB extends Visitor {
    @Override
    public void visitConcreteElementA(Element elementA) {
        System.out.println("ConcreteVisitorB visitor ConcreteElementA...");
    }

    @Override
    public void visitConcreteElementB(Element elementB) {
        System.out.println("ConcreteVisitorB visitor ConcreteElementB...");
    }
}
