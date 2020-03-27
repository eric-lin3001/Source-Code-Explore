package com.personal.Base.Reuse;


public class ClassNew {
   private ClassExist classExist;

   public String toString(){
       classExist.f();
       if(classExist == null){ // lazy (delayed) initialization:
           classExist = new ClassExist();
       }
       return "b";
   }


    public static void main(String[] args) {
        ClassNew cn = new ClassNew();
        System.out.println(cn);
    }
}
