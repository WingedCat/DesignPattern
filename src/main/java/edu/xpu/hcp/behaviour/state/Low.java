package edu.xpu.hcp.behaviour.state;

public class Low extends State {
    @Override
    public void pull(Car car) {
        car.setState(new Medium());
        System.out.println("低挡挂中档");
    }
}
