package edu.xpu.hcp.creational.simplefactory;

public class Client {
    public static void main(String[] args) {
        User user = Factory.getUser("root", 20, "Super");
        System.out.println(user);
        User user1 = Factory.getUser("zhangsan", 30, "Normal");
        System.out.println(user1);
    }
}
