package edu.xpu.hcp.struct.facade;

public class Student {
    private String name;
    private Integer age;
    private Integer sex;

    public Student(String name, Integer age,Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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
}
