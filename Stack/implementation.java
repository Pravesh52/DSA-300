// package Stack & Queue;

public class implementation {
    Node head=null;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // push operation
     public void push(int x){
        Node newnode=new Node(x);
        newnode.next=head;
        head=newnode;
     }
    //  Pop operation

    int pop(){
        if(head==null){
            System.out.println("Stack is empty..");
            return -1;
        }
        int data=head.data;
        head=head.next;
        return data;
    }

// Peek operation

    int peek(){
        if(head==null){
            System.out.println("Stack is empty..");
            return -1;
        }
    System.out.println(head.data);
        return head.data;
    }
    // Display

    public void Display(){
        if(head==null){
            System.out.println("List is empty..");
            return;
        }

        Node temp=head;

        while(temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
            
        }

    }

       
    public static void main(String[] args) {
        implementation stack=new implementation();
        System.out.println("Push Operation: ");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.Display();
        System.out.println("After the Pop...");

        stack.pop();
        stack.Display();

        System.out.println("Peek number.");
        stack.peek();
        
        
    }
}
