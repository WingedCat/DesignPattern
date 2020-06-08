package edu.xpu.hcp.creational.builder;

public class Director {
    public void Build(Builder builder){
        builder.step1();
        builder.step2();
    }
}
