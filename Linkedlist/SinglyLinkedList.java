// package Linkedlist;

public class SinglyLinkedList {
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

        public  void insertatbeginnig(int data){
            Node newNode=new Node(data);

            newNode.next = head;
            head = newNode;
            
        }

        //insert at end

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
            
        }

        //insert at position

        public void insertatPos(int pos, int data){
            Node newNode=new Node(data);

            if(pos==1){
                newNode.next=head;
                head=newNode;
                return;
            }

            Node temp=head;

            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;

        }

        //Display function

         public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        //insert at beginning

        list.insertatbeginnig(10);
        list.insertatend(20);
        list.insertatend(30);
        list.insertatend(40);

        //insert at position

        list.insertatPos(3, 25);
        list.display();



    }
}
