package edu.xpu.hcp.behaviour.state;

public class Off extends State {
    @Override
    public void pull(Car car) {
        car.setState(new Low());
        System.out.println("空挡挂抵挡");
    }
}
