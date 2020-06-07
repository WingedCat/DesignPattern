package edu.xpu.hcp.behaviour.memento;

/**
 * 备忘录
 */
public class Memento {
    private String name;
    private String tel;
    private double budget;

    public Memento(String name, String tel, double budget) {
        this.name = name;
        this.tel = tel;
        this.budget = budget;
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
