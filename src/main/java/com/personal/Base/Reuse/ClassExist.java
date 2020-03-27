package com.personal.Base.Reuse;


public class ClassExist {
    ClassExist(){
        System.out.println("这是现有类的构造器");
    }
    public String toString(){
        return "测试toString()方法";
    }

    public String f(){
        return "测试调用未被初始化的引用的方法";
    }

}
