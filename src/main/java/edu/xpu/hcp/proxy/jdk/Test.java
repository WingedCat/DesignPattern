package edu.xpu.hcp.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test implements InvocationHandler {
    private Operation operation;

    public Test(Operation operation) {
        this.operation = operation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前");
        method.invoke(operation,args);
        System.out.println("执行后");
        return null;
    }

    public static void main(String[] args) throws Exception {
        Operation operation = new OperationImpl();
        Test test = new Test(operation);
        Operation o = (Operation)Proxy.newProxyInstance(operation.getClass().getClassLoader(), operation.getClass().getInterfaces(), test);
        o.add(1,2);
    }
}
