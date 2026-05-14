// import org.w3c.dom.Node;

import org.w3c.dom.Node;

public class Balancedtree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }


    // convert array to tree
    public static Node buildtree(Integer[]arr, int i){
        if(i>=arr.length || arr[i]==null) return null;

        Node root=new Node(arr[i]);

        root.left=buildtree(arr,2*i+1);
        root.right=buildtree(arr,2*i+2);

        return root;


    }


    public static boolean isbalanced(Node root){
        return checkheight(root)!=-1;
    }

public static int  checkheight(Node node){
        if(node==null) return 0;

        int left=checkheight(node.left);

        if(left==-1) return -1;

        int right=checkheight(node.right);
        if(right== -1) return -1;


        if(Math.abs(left-right)>1) return -1;

        return Math.max(left, right)+1;
    }


    public static void main(String[] args) {

         // Example Tree
        //      1
        //     / \
        //    2   3
        //   /
        //  4

        Integer arr[]={3, 9, 20, null, null, 15, 7};
        Node root=buildtree(arr, 0);

        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);

        if (isbalanced(root)) {
            System.out.println("Tree is Balanced");
        } else {
            System.out.println("Tree is NOT Balanced");
        }
        
    }
}
