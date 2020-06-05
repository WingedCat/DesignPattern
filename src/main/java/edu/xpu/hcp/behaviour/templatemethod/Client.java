package edu.xpu.hcp.behaviour.templatemethod;

public class Client {
    public static void main(String[] args) {
        AbstractJDBC jdbc = new ConcreteJDBC();
        jdbc.run();
    }
}
