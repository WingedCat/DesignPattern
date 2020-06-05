package edu.xpu.hcp.proxy.javaassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;

public class Test {
    public static void main(String[] args) throws Exception{
        ClassPool classPool = ClassPool.getDefault();
        //1、创建类
        CtClass makeClass = classPool.makeClass("edu.xpu.hcp.proxy.javaassist.User");
        //2、创建name和age属性
        CtField name = CtField.make("private String name;", makeClass);
        CtField age = CtField.make("private Integer age;", makeClass);
        //3、添加属性
        makeClass.addField(name);
        makeClass.addField(age);
        //4、创建方法
        final CtMethod getNameMethod = CtMethod.make("public String getName() {return name;}", makeClass);
        final CtMethod getAgeMethod =CtMethod.make("public Integer getAge() {return age;}",makeClass);

        makeClass.addMethod(getAgeMethod);
        makeClass.addMethod(getNameMethod);

        makeClass.writeFile("D://test");
    }
}
