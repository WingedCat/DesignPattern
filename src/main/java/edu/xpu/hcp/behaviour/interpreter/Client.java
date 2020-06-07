package edu.xpu.hcp.behaviour.interpreter;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");

        Constant constant = new Constant(true);

        context.assign(x,false);
        context.assign(y,true);

        AbstractExpression exp = new Or(new And(constant,x),new And(y,new Not(x)));

        System.out.println(x.Interpret(context));
        System.out.println(y.Interpret(context));

        System.out.println(exp.Interpret(context));

    }
}
