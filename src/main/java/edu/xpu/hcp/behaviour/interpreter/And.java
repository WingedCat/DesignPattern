package edu.xpu.hcp.behaviour.interpreter;

public class And extends AbstractExpression {

    private AbstractExpression left;
    private AbstractExpression right;


    public And(AbstractExpression exp1,AbstractExpression exp2){
        this.left = exp1;
        this.right = exp2;
    }

    @Override
    public boolean Interpret(Context context) {
        return left.Interpret(context) && right.Interpret(context);
    }
}
