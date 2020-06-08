package edu.xpu.hcp.behaviour.visitor;

public class ConcreteVisitorA extends Visitor {
    @Override
    public void visitConcreteElementA(Element elementA) {
        System.out.println("ConcreteVisitorA visitor ConcreteElementA...");
    }

    @Override
    public void visitConcreteElementB(Element elementB) {
        System.out.println("ConcreteVisitorA visitor ConcreteElementB...");
    }
}
