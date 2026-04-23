// package Binary Tree;

public class maxDepth {

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

    public static int treemaxheight(Node root){
        // Base case

        if(root==null){
            return 0;
        }

        // find left and right depth

        int leftdepth=treemaxheight(root.left);
        int rightdepth=treemaxheight(root.right);

        // Max depth find 

        return Math.max(leftdepth, rightdepth)+1;



    }
    public static void main(String[] args) {
        // Example Tree:
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7

        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        int result = treemaxheight(root);
        System.out.println("Maximum Depth: " + result);
        
    }
}
