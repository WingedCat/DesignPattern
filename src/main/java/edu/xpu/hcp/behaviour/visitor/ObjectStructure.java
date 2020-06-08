package edu.xpu.hcp.behaviour.visitor;

import java.util.ArrayList;

public class ObjectStructure {
    private ArrayList<Element> list = new ArrayList<>();

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element element : list) {
            element.accept(visitor);
        }
    }
}
