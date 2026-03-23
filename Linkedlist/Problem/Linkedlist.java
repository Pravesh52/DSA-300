class Linkedlist {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert at beginning
    public void insertatbeginning(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    // insert at end
    public void insertatend(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    // partition function
    public Node midleftright(int x) {
        if (head == null || head.next == null) {
            return head;
        }

        Node smallhead = new Node(0);
        Node largehead = new Node(0);

        Node small = smallhead;
        Node large = largehead;

        Node temp = head;

        while (temp != null) {
            if (temp.data < x) {
                small.next = temp;
                small = small.next;
            } else {
                large.next = temp;
                large = large.next;
            }
            temp = temp.next;
        }

        large.next = null;
        small.next = largehead.next;

        return smallhead.next;
    }

    // display function
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.insertatbeginning(5);
        list.insertatend(4);
        list.insertatend(1);
        list.insertatend(8);
        list.insertatend(2);

        System.out.print("Original List: ");
        list.Display();

        list.head = list.midleftright(3);

        System.out.print("Partitioned List: ");
        list.Display();
    }
}