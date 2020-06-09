package edu.xpu.hcp.creational.simplefactory;

public abstract class User {
    private String name;
    private Integer age;
    private String type;

    public User(String name, Integer age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
