package edu.xpu.hcp.struct.proxy.javaassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;

public class Test2 {
    public static void main(String[] args) throws Exception{
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("edu.xpu.hcp.struct.proxy.javaassist.User");
        CtConstructor ctConstructor = new CtConstructor(new CtClass[]{pool.get("java.lang.String"), pool.get("java.lang.Integer")}, ctClass);
        ctConstructor.setBody("{this.name=name;this.age=age;}");

        ctClass.addConstructor(ctConstructor);

        ctClass.writeFile("E://");
        Class aClass = ctClass.toClass();
        Object o = aClass.newInstance();


    }
}
