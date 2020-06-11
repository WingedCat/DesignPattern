package edu.xpu.hcp.struct.composite;

public class Leaf implements Component {
    @Override
    public void doSomething() {
        System.out.println("Leaf do...");
    }

}
