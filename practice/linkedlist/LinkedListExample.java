package practice.linkedlist;

public class LinkedListExample {

    public static void main(String [] args){
        ListNode head= new ListNode(10);
        ListNode second= new ListNode(20);
        ListNode third= new ListNode(30);

        head.next=second;
        second.next=third;

        //inserting at the first
        ListNode newNode= new ListNode(5);
        newNode.next=head;
        head= newNode;

        //inserting at the last
        ListNode lastNode= new ListNode(40);
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=lastNode;


        ListNode current = head;
        while (current!=null){
            System.out.print(current.val+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
}
