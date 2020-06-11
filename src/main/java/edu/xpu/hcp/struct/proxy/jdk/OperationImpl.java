package edu.xpu.hcp.struct.proxy.jdk;

public class OperationImpl implements Operation{

    @Override
    public void add(int a,int b) {
        System.out.println("实现类进行操作："+a+b);
    }
}
