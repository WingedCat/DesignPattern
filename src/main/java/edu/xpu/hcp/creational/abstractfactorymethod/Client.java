package edu.xpu.hcp.creational.abstractfactorymethod;

public class Client {
    private AbstractProductA a;
    private AbstractProductB b;

    public Client(AbstractFactory factory){
        a = factory.createProductA();
        b = factory.createProductB();
    }

    public void run(){
        b.Interact(a);
    }

    public static void main(String[] args) {
        AbstractFactory abstractProductA = new ConcreteFactory1();
        Client client = new Client(abstractProductA);
        client.run();

        AbstractFactory abstractProductB = new ConcreteFactory2();
        Client client2 = new Client(abstractProductB);
        client2.run();

    }
}
