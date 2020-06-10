package edu.xpu.hcp.struct.deorate;

public class Client {
    public static void main(String[] args) {
        Decorator decorator = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponentA()));
        decorator.doSomething();
    }
}
