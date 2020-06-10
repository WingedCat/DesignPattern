package edu.xpu.hcp.struct.facade;

public class Subsystem1 {
    public boolean isAgeValid(Student student){
        if(student.getAge() > 18){
            return true;
        }
        return false;
    }
}
