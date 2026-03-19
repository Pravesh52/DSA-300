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

// Reverse a linked list
public void reverselinkedlist(){
        Node prev = null;
        Node curr = head;
        Node next = null;


    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}
//  Remove Nth Node From End of List
     public void nthnodedelete(int pos){
        // reverse a linkedlist
          Node prev = null;
        Node curr = head;
        Node next = null;


          while(curr!=null){
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
        }
        head=prev;

        //delete at position
        if(pos==1){
            head=head.next;
            return;
        }
        Node temp=head;
       for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
     }

    //  optimize nthnode delete code

    public void nthnode(int pos){
        Node dummy=new Node(0);
        dummy.next=head;
        Node fast=dummy;
        Node slow=dummy;

        for(int i=0;i<=pos;i++){
            fast=fast.next;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        
        
    }
// reverse a linked list
   public void reverse(){
         Node prev=null;
         Node curr=head;
         Node next=null;

         while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         head=prev;
   }

    // sort 0s 1s and 2s

  public void sort012() {
    if(head == null || head.next == null){
        if(head != null)
            System.out.println(head.data);
        return;
    }

    Node zerohead = new Node(-1);
    Node onehead = new Node(-1);
    Node twohead = new Node(-1);

    Node zero = zerohead, one = onehead, two = twohead;

    Node temp = head;
    while(temp != null){
        if(temp.data == 0){
            zero.next = temp;
            zero = zero.next;
        } else if(temp.data == 1){
            one.next = temp;
            one = one.next;
        } else {
            two.next = temp;
            two = two.next;
        }
        temp = temp.next;
    }

    // Merge three lists
    if(onehead.next != null){
        zero.next = onehead.next;
    } else {
        zero.next = twohead.next;
    }
    one.next = twohead.next;
    two.next = null;

    // Update head
    head = zerohead.next;

    // Print sorted list
    Node curr = head;
    while(curr != null){
        System.out.print(curr.data + " <-> ");
        curr = curr.next;
    }
    System.out.println("null");
}

// Add 1 to linked list
public void add1(){
    reverse();

    Node prev=null;
    Node curr=head;
    int  carry=1;

    while(curr!=null){
        int sum=curr.data+carry;
        curr.data=sum%10;
        carry=sum/10;
        prev=curr;
        curr=curr.next;
    }
    // if carry is still in 1 add a new node
     
    if(carry>0){
        prev.next=new Node(carry);
    }

    reverse();


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
        // list.insertatend(1);
        // list.insertatend(2);
        list.display();
        list.add1();

    //    list.nthnode(2);
    // list.sort012();
        list.display();


        



    }
}
