package edu.xpu.hcp.creational.prototype;

public class Client {
    public static void main(String[] args) {
        ProtoType protoType = new ConcretePrototype("zhangsan",20);
        ProtoType clone = protoType.clone();
        System.out.println(clone == protoType);
    }
}
