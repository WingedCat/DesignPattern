package edu.xpu.hcp.behaviour.interpreter;

public class Constant extends AbstractExpression {
    private boolean value;

    public Constant(boolean value){
        this.value = value;
    }
    @Override
    public boolean Interpret(Context context) {
        return value;
    }
}
