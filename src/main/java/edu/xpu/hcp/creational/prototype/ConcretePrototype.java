package edu.xpu.hcp.creational.prototype;

public class ConcretePrototype extends ProtoType {
    public ConcretePrototype(String name,Integer age){
        super(name,age);
    }
    @Override
    protected ProtoType clone() {
        ProtoType cloned = new ConcretePrototype(super.getName(),super.getAge());
        return cloned;
    }
}
