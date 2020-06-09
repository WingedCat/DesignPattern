package edu.xpu.hcp.creational.factroymethod;

public class ConcreteFactoryA implements ProductFactory{

    @Override
    public  Product getProduct() {
        return new ConcreteProductA();
    }
}
