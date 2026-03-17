// package Doubly;

public class DoublyLinkedList {
    Node head=null;
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
           this.data=data;
           this.prev=null;
           this.next=null; 
        }
    }

    //Insert at begining
    public void insertatbeginnig(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        newNode=head;
    }

    //Insert at end
    public void insertatend(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newNode;
        newNode.prev=temp;

    }
    // insert at position
    public void insertposition(int data,int pos){
        Node nwNode=new Node(data);

        if(pos==1){
            head=nwNode;
            return;
        }

        Node temp=head;

        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }

        nwNode.next=temp.next;
        nwNode.prev=temp;

        if(temp.next!=null){
            temp.next.prev=nwNode;
        }
        temp.next=nwNode;
    }

    //Display forward

    public void displayforward(){
        if(head==null){
            System.out.println("List is empty: ");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // Display backward

    public void Displaybackward(){
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.prev;

        }
        System.out.println("null");
    }

    // Delete from beginning
    public void delbegining(){
        if(head==null){
            System.out.println("List is empty...");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
        head.prev=null;

        
    }
    // Delete from end

    public void delend(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        if(temp.prev==null){
            head=null;
            return;
        }

        temp.next.prev=null;
    }

    // Delete from position

    public void delpos(int pos){
        if(head==null){
            System.out.println("List empty..");
            return;
        }
        if(pos==1){
            head=null;
            return;
        }
        Node temp=head;

        for(int i=1;i<pos;i++){
            temp=temp.next;
        }

        if(temp.next==null){
            temp.prev.next=null;
            return;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }


    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertatbeginnig(10);
        list.insertatend(20);
        list.insertatend(30);
        list.insertatend(40);
        list.insertatend(50);
        list.insertposition(25, 3);

        list.displayforward();
        list.Displaybackward();
        
    }
}
