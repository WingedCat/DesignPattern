package edu.xpu.hcp.creational.prototype;

public abstract class ProtoType implements Cloneable {
    private String name;
    private Integer age;

    public ProtoType(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected abstract ProtoType clone();
}
