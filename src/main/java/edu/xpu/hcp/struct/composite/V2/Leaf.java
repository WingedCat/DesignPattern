package edu.xpu.hcp.struct.composite.V2;

import java.util.List;

public class Leaf implements Component {
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Component> getAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void doSomething() {
        System.out.println("Leaf do...");
    }
}
