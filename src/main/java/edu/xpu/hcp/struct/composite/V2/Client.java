package edu.xpu.hcp.struct.composite.V2;

public class Client {
    public static void main(String[] args) {
        Component leafA = new Leaf();
        Component leafB = new Leaf();
        Component composite1 = new Composite();
        Component composite2 = new Composite();
        composite1.add(leafA);
        composite1.add(composite2);
        composite2.add(leafB);

        composite1.doSomething();

    }
}
