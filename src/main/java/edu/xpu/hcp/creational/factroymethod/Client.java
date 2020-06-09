package edu.xpu.hcp.creational.factroymethod;

public class Client {
    public static void main(String[] args) {
        Product product = new ConcreteFactoryA().getProduct();
        product.call();

        Product product2 = new ConcreteFactoryB().getProduct();
        product2.call();
    }
}
