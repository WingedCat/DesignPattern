package edu.xpu.hcp.struct.deorate;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component){
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();//基本功能
        doAnotherThing();//附加功能
    }

    private void doAnotherThing(){
        System.out.println("ConcreteDecoratorA do another thing");
    }
}
