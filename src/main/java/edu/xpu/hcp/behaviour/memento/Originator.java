package edu.xpu.hcp.behaviour.memento;

/**
 * 原生器
 */
public class Originator {
    private String name;
    private String tel;
    private double budget;

    //保存备忘录
    public Memento saveMemeto(){
        return new Memento(name,tel,budget);
    }
    //恢复备忘录
    public void restoreMemento(Memento memento){
        this.name = memento.getName();
        this.tel = memento.getTel();
        this.budget = memento.getBudget();
    }

    public void show(){
        System.out.println("备忘录信息为：");
        System.out.println("Name: "+name);
        System.out.println("Tel: "+tel);
        System.out.println("Budget: "+budget);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
