package Problem;
// Array to Doubly LinkedList

public class ArraytoDLL {
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
    public void arraytodll(int arr[]){
        head= new Node (arr[0]);
        Node temp=head;

        for(int i=1;i<arr.length;i++ ){

             Node newNode = new Node(arr[i]);

            // link previous node se
            temp.next = newNode;      
            newNode.prev = temp;      

            // temp ko aage badhao
            temp = newNode;
        }
    }

    // Display

    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ArraytoDLL obj=new ArraytoDLL();
        int arr[]={1,2,3,4,5,6};
        obj.arraytodll(arr);
        obj.display();

    }
}
