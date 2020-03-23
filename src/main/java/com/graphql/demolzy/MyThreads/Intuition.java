package com.graphql.demolzy.MyThreads;

public class Intuition {
    public static void main(String[] args) {
        /** TODO
         * 1. 为什么thread.sleep() 要加try catch?
         * 2. 为什么main2不会打印在myThread => 1和myThread => 2之间？（或者很少？）
         */

        System.out.println("main => 1");
        Thread myFstThread = new Thread(){

           public void run(){
                System.out.println("myThread => 1");
//               try {
//                   Thread.sleep(10);
//               } catch (InterruptedException e) {}
               System.out.println("myThread => 2");
            }
        };
        myFstThread.start();
        System.out.println("main => 2");

    }
}
