package edu.xpu.hcp.struct.proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubject());
        subject.request();
    }
}
