package edu.xpu.hcp.struct.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> list = new ArrayList<>();

    public void add(Component component){
        list.add(component);
    }
    public void remove(Component component){
        list.remove(component);
    }

    public List<Component> getAll(){
        return list;
    }

    @Override
    public void doSomething() {
        list.forEach(Component::doSomething);
    }
}
