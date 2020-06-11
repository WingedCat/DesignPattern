package edu.xpu.hcp.struct.proxy;

public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("before invoke");
        subject.request();
        System.out.println("after invoke");
    }
}
