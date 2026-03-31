package practice.linkedlist.problem;

import java.util.List;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class solution206 {

    public Node reverseList( Node list){

        Node current= list;
        Node next= null;
        Node prev=null;

        while(current.next!=null){
             next=current.next;
             current.next=prev;
             prev=current;
        }
        return null;
    }
}
