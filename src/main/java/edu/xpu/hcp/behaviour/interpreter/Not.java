package edu.xpu.hcp.behaviour.interpreter;

public class Not extends AbstractExpression {

    private AbstractExpression exp;


    public Not(AbstractExpression exp){
        this.exp = exp;
    }

    @Override
    public boolean Interpret(Context context) {
        return !exp.Interpret(context);
    }
}
