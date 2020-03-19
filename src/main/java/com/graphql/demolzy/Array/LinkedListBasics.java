package com.graphql.demolzy.Array;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class LinkedListBasics<E> {

    /**
     * Constructs an empty list.
     */
    public LinkedListBasics() {
    }


    /**
     * data in the current node.
     */
    transient E data;

    /**
     *
     */
    transient Node<E> first;

    /**
     *
     */
    transient Node<E> last;

    transient int size = 0;


    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     *
     * add e to the end of the linked list
     */
    public void add(E e){
        // A ref to store "last" that need to be in front of e node.
        Node<E> l = last;
        // Create a new node that should be in the last.
        Node<E> newNode = new Node<>(l,e,null);
        last = newNode;
        if(l==null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }
}
