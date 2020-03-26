package com.personal.Base;

public class UsingThis {
    int a =0;
    public void f(){
        System.out.println(this.a);
    }

    public void incre_a(){
        a++;
    }

    public static void main(String[] args) {
        UsingThis x =new UsingThis();
        x.f();

        UsingThis y =new UsingThis();
        y.incre_a();
        y.f();
        x.f();
        y.f();
    }

}
