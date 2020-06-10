package edu.xpu.hcp.struct.deorate;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component){
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();//基本功能
        doAnotherThing();//附加功能
    }

    private void doAnotherThing(){
        System.out.println("ConcreteDecoratorB do another thing");
    }
}
