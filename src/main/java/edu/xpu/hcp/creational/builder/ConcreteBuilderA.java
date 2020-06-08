package edu.xpu.hcp.creational.builder;

import javax.annotation.PreDestroy;

public class ConcreteBuilderA extends Builder {
    private Product product = new Product();

    @Override
    public void step1() {
        product.add("partA");
    }

    @Override
    public void step2() {
        product.add("partB");
    }

    @Override
    public Product build() {
        return product;
    }
}
