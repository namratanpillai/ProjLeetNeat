package com.leet.neat.LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.insert(1,0);
        singleLinkedList.printList();
        singleLinkedList.insert(2,1);
        singleLinkedList.printList();
        singleLinkedList.insert(3,1);
        singleLinkedList.printList();
        System.out.println(singleLinkedList.searchValue(10));


    }
}
