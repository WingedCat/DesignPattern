package edu.xpu.hcp.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> list = new ArrayList<>();

    public void add(String content){
        list.add(content);
    }

    public void show(){
        list.forEach(System.out::println);
    }
}
