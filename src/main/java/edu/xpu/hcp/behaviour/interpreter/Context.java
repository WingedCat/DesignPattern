package edu.xpu.hcp.behaviour.interpreter;

import java.util.HashMap;

public class Context {
    private HashMap<Variable,Boolean> map = new HashMap<>();

    public void assign(Variable var,boolean value){
        map.put(var,value);
    }

    public boolean lookup(Variable var){
        return map.get(var);
    }

}
