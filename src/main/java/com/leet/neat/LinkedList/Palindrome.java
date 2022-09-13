package com.leet.neat.LinkedList;

public class Palindrome {

    public boolean isPalindrome(Node head) {

        Node slowPointer=head;
        Node fastPointer=head;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }

        Node reversed=reverse(slowPointer);

        while(head!=reversed && head!=null && reversed!=null){
            if(head.value==reversed.value){
                head=head.next;
                reversed=reversed.next;
                continue;
            }
            return false;
        }

        return true;
    }

    Node reverse( Node head){
        if(head==null || head.next==null)
            return head;

        Node newHead=reverse(head.next);
        Node headNext=head.next;
        headNext.next=head;
        head.next=null;
        return newHead;
    }


}
