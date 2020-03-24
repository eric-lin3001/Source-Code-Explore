package com.personal.Array;

public class TestListRsts {

    public static void main(String[] args) throws Exception {
        MyLinkedList l1 = new MyLinkedList();
        l1.item = 7;
        MyLinkedList l2 = new MyLinkedList();
        l2.item = 0;
        MyLinkedList l3 = new MyLinkedList();
        l3.item = 6;

        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        l2.insertAfter(8);
//        MyLinkedList l2_nth0= l2.nth(0);
//        MyLinkedList l2_nth1= l2.nth(1);
        MyLinkedList l2_nth2= l2.nth(2);

        int a =0;
//        MyLinkedList l4 = new MyLinkedList(7,new MyLinkedList(0,new MyLinkedList(6)));

    }
}
