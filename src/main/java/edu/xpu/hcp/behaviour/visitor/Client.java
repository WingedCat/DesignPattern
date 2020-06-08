package edu.xpu.hcp.behaviour.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());

        Visitor visitor1 = new ConcreteVisitorA();
        Visitor visitor2 = new ConcreteVisitorB();

        structure.accept(visitor1);
        structure.accept(visitor2);
    }
}
