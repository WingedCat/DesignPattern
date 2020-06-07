package edu.xpu.hcp.behaviour.state;

/**
 * 环境角色
 */
public class Car {
    private State currentState;

    public Car(){
        this.currentState = new Off();
        System.out.println("新汽车，空挡");
    }

    public void setState(State s){
        currentState = s;
    }

    public void pull(){
        //挂挡
        currentState.pull(this);
    }
}
