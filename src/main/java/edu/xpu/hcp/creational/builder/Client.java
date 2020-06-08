package edu.xpu.hcp.creational.builder;

import java.nio.ByteBuffer;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();

        director.Build(builderA);
        builderA.build().show();

    }
}
