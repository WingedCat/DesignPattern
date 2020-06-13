package edu.xpu.hcp.struct.adapter;

public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteAdapter1();
        target.myOutput();

        Target target2 = new ConcreteAdapter2();
        target2.myOutput();
    }
}
