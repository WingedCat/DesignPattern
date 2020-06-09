package edu.xpu.hcp.creational.factroymethod;

public class ConcreteFactoryB implements ProductFactory{

    @Override
    public Product getProduct() {
        return new ConcreteProductB();
    }
}
