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

    public void insertatend(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Node temp=head;
        
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }

    // insert at position

    public void insertposition(int pos, int data){
        Node newNode=new Node(data);
        if(pos==1){
            insertatbeginnig(data);
            return;
        }
        Node temp=head;

        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    //Delete at begining

    public void delbegining(){

        if(head==null){
            System.out.println("not found list");
            return;
        }

        if(head.next==head){
            head=null;
            return;
        }

        Node temp=head;

        while(temp.next!=head){
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;

    }

    // Delete at last

    public void dellast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }

        Node temp=head;

        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    }

    // delete at position

    public void delpos(int pos){
        // if(head==null){
        //     System.out.println("List is empty");
        // }

        if(pos==1){
            delbegining();
            return;
        }

        Node temp=head;

        for(int i=1;i<pos-1;i++){
            temp=temp.next;

        }
        temp.next=temp.next.next;

    }

    // display

    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node temp=head;

       do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");

    }


    



    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.insertatbeginnig(10);
        list.insertatend(20);
        list.insertatend(30);
        list.insertatend(40);
        list.insertatend(50);

        list.display();

        list.delpos(2);
        list.display();
        
    }
}
