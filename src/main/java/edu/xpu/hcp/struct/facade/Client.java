package edu.xpu.hcp.struct.facade;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("zhangsan",19,1);
        Facade facade = new Facade();
        System.out.println(facade.isValid(student));
    }
}
