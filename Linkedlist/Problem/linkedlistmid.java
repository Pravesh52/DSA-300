

public class linkedlistmid {
    Node head=null;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertatbeginning(int data){
        Node newnode=new Node(data);

        newnode.next=head;
        head=newnode;
    }
    public void insertatend(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
    }
    public void findmid(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node slow=head;
        Node fast=head;

        while (fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        System.out.println("Mid: "+slow.data);
    }

    public void Display(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;

        }
        System.out.println("null");
    }
    public void reverselinkedlist(){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        linkedlistmid list=new linkedlistmid();
        list.insertatbeginning(10);
        list.insertatend(20);
        list.insertatend(30);
        list.insertatend(40);
        list.Display();
        list.reverselinkedlist();
        list.findmid();

        list.Display();
        
    }
}
