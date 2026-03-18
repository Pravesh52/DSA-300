// Segregate odd/even

public class oddeven {
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
        Node newnode =new Node(data);
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
public void oddeven() {
    if(head == null || head.next == null) return;
    
    Node odd = head;
    Node even = head.next;
    Node evenhead = even;
    while(even != null && even.next != null) {
        odd.next=even.next;
        odd = odd.next;

        even.next = odd.next;
        even = even.next;
    }
    odd.next=evenhead;
}
    public void display(){
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
    public static void main(String[] args) {
        oddeven list = new oddeven();
        // input head=1,2,3,4,5
        // output 1,3,5,2,4
        list.insertatbeginning(1);
        list.insertatend(2);
        list.insertatend(3);
        list.insertatend(4);
        list.insertatend(5);
        list.display();

        list.oddeven();
        list.display();


        



    }
}
