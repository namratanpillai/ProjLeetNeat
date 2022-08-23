package com.leet.neat.LinkedList;

import java.util.Objects;

public class SingleLinkedList {

    Node head=null;
    Node tail=null;
    int size;

 public Node createSingleLinkedList(int value){
        head=new Node();
        Node node=new Node();
        node.value=value;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }

   /* public void insertInTheBegining(int value){
        Node node=new Node();
        node.value=value;
        node.next=head;
        head=node;
    }*/

    public void insert(int value, int location){
        Node node=new Node();
        node.value=value;
        if(head==null){
            createSingleLinkedList(value);
            return;
        }
        else if(location==0){
            node.next=head;
            head=node;
        }else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }else{
           Node pointer=head;
           int index=0;
           while(index<location-1){
               pointer=pointer.next;
           }
           Node nextNode=pointer.next;
           pointer.next=node;
           node.next=nextNode;
        }
        size+=1;
    }

    boolean searchValue(int value){
        Node pointer=head;
        if(head!=null){
            while(pointer!=null){
                if(pointer.value==value)
                    return true;
                pointer=pointer.next;
            }

        }
        return false;
    }

    void printList(){
        Node pointer=head;
        System.out.print("NULL --> ");
        while (pointer !=null){

            System.out.print(pointer.value+ " --> ");
            pointer=pointer.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    void deletionOfNode(int location){

        if(Objects.isNull(head)){
            System.out.println("Single Linked List does not exist");
            return;
        }

        else if(location==0){
            head=head.next;
            size=size-1;
            if(size==0){
                tail=null;
            }
        }else if(location>=size){
            Node beforeLast=head;
            int index=0;
            while(index<size-1){
                beforeLast=beforeLast.next;
                index++;
            }
            if(beforeLast==head){
                tail=head=null;
                size=size-1;
            }
            beforeLast.next=null;
            tail=beforeLast;
            size=size-1;
        }else{
            Node beforeLast=head;
            int index=0;
            while(index<location-1){
                beforeLast=beforeLast.next;
                index++;
            }
            beforeLast.next=beforeLast.next.next;
            size=size-1;
        }

    }

}
