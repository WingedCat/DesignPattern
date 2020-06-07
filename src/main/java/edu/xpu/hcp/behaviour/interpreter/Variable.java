package edu.xpu.hcp.behaviour.interpreter;

/**
 * 终结符表达式
 */
public class Variable extends AbstractExpression {

    private String name;

    @Override
    public boolean Interpret(Context context) {
        return context.lookup(this);
    }
    public Variable(String s){
        this.name = s;
    }
}
