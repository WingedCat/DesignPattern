package edu.xpu.hcp.struct.facade;


public class Facade {
    public boolean isValid(Student student){
        Subsystem1 subsystem1 = new Subsystem1();
        Subsystem2 subsystem2 = new Subsystem2();
        return subsystem1.isAgeValid(student) && subsystem2.isSexValid(student);
    }
}
