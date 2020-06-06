package edu.xpu.hcp.behaviour.command;

public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void ExecuteComand(){
        command.execute();
    }
}
