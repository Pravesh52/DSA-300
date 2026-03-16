// package Circular;

public class CircularLinkedList {
    Node head=null;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //insert at beginning

    public void insertatbeginnig(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Node temp=head;

        while(temp!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
        head=newNode;
    }

    // insert at end

    



    public static void main(String[] args) {
        
    }
}
