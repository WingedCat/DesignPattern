package edu.xpu.hcp.struct.facade;

public class Subsystem2 {
    public boolean isSexValid(Student student){
        if(student.getSex() == 1){
            return true;
        }
        return false;
    }
}
