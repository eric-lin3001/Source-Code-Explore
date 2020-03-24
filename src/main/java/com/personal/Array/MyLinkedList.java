package com.personal.Array;

public class MyLinkedList<E> {

    public E item;
    public MyLinkedList<E> next;

    MyLinkedList(){
    }


    MyLinkedList(E item, MyLinkedList<E> next) {
        this.item = item;
        this.next = next;
    }

    MyLinkedList(E item){
        this(item,null);
    }


    /**
     *
     * insert item after "this" node
     */
    public void insertAfter(E e){
        next = new MyLinkedList<>(e,next);
    }

    /**
     *
     * find nth position of  "this" node
     */
    public MyLinkedList nth(int position){
        if(position==1){
            return this;
        }else {
            MyLinkedList nowNext = next;
            return next.nth(position-1);
        }
    }

}
