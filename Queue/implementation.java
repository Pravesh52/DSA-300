// package Queue;

public class implementation {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    Node front=null;
    Node rear=null;
    
    // Enqueue

    public void Enqueue(int x){
        Node newnode= new Node(x);

        if(rear==null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
       rear= newnode;

    }

    // dequeue

    int dequeue(){
        if(front==null){
            System.out.println("Queue is empty.");
            return -1;
        }
        int data=front.data;
        front=front.next;

        if(front==null){
            rear=null;
        }
        return data;

    }

    // Peek
    int peek(){

        if(front==null){
            System.out.println("Queue is empty");
            return -1;
        }
        
        return front.data;
    }

    // isempty

    public void isempty(){
        if(front==null && rear==null){
            System.out.println("Queue is empty");
            return;
        }
    }

    // display
    public void Display(){
        if(front==null){
            System.out.println("Queue is empty..");
            return;
        }
        Node temp=front;

        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        implementation q=new implementation();
        System.out.println("Insertion of queue.");
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);

        q.Display();

        System.out.println("Deletion of Queue.");

        q.dequeue();
        q.Display();
    }
    
}
