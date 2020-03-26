package com.personal.Exceptions;

public class MyTryCatch {
    public static void main(String[] args) throws Exception {
        try {
            int a = 1/0;
        }catch (Exception e){
            throw new Exception("stop");
//            System.out.println("go on!");
        }
        System.out.println("Actually Go On!");
        String s;

    }
}
