package edu.xpu.hcp.behaviour.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setName("zhangsan");
        originator.setTel("123112");
        originator.setBudget(100.0);

        originator.show();
        System.out.println("=============");

        Caretaker caretaker = new Caretaker();
        //把保存的备忘录给看管者看管
        caretaker.setMemento(originator.saveMemeto());
        //改变原生器中的备忘录
        originator.setName("lisi");
        originator.setTel("9090212");
        originator.setBudget(1000.0);
        originator.show();
        System.out.println("=============");

        //恢复备忘录
        originator.restoreMemento(caretaker.getMemento());

        originator.show();
        System.out.println("=============");
    }
}
