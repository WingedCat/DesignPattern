package edu.xpu.hcp.creational.simplefactory;

public class Factory {

    public static User getUser(String name,Integer age,String type){
        if("Super".equals(type)){
            return new SuperUser(name,age);
        }
        return new NormalUser(name,age);
    }
}
