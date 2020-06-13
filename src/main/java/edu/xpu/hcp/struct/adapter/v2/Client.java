package edu.xpu.hcp.struct.adapter.v2;

import edu.xpu.hcp.struct.adapter.Target;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new ConcreteAdapteeA());
        target.myOutput();

        Target target2 = new Adapter(new ConcreteAdapteeB());
        target2.myOutput();
    }
}
