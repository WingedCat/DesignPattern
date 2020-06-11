package edu.xpu.hcp.struct.composite.V2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> list = new ArrayList<>();

    @Override
    public void add(Component component){
        list.add(component);
    }
    @Override
    public void remove(Component component){
        list.remove(component);
    }
    @Override
    public List<Component> getAll(){
        return list;
    }

    @Override
    public void doSomething() {
        list.forEach(Component::doSomething);
    }
}
