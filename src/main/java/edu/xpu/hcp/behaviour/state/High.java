package edu.xpu.hcp.behaviour.state;

public class High extends State {
    @Override
    public void pull(Car car) {
        car.setState(new Off());
        System.out.println("高档回空挡");
    }
}
