package edu.xpu.hcp.creational.builder;

public class ConcreteBuilderB extends Builder {
    private Product product = new Product();

    @Override
    public void step1() {
        product.add("partX");
    }

    @Override
    public void step2() {
        product.add("partY");
    }

    @Override
    public Product build() {
        return product;
    }
}
