package edu.xpu.hcp.creational.abstractfactorymethod;

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
