package edu.xpu.hcp.creational.abstractfactorymethod;

public class ProductB1 extends AbstractProductB{
    @Override
    public void Interact(AbstractProductA a) {
        System.out.println(this.getClass().getSimpleName() + "..."+a.getClass().getSimpleName());
    }
}
