// Binary Tree Traversal

import java.util.LinkedList;
import java.util.Queue;

public class traversal {

    // Node Class
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {

            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    // Build Tree using Preorder

    static int idx = -1;

    static Node buildtree(int[] arr) {

        idx++;

        if (idx >= arr.length || arr[idx] == -1) {
            return null;
        }

        Node root = new Node(arr[idx], null, null);

        root.left = buildtree(arr);   // Left Subtree
        root.right = buildtree(arr);  // Right Subtree

        return root;
    }

    // Preorder Traversal
    public void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);

        preorder(root.right);
    }

    // Inorder Traversal
    public void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    // Postorder Traversal
    public void postorder(Node root) {

        if (root == null) {
            return;
        }

        postorder(root.left);

        postorder(root.right);

        System.out.print(root.data + " ");
    }

    // Height of Binary Tree
    public int height(Node root) {

        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // Print Particular Level
    public void levelorder(Node root, int level) {

        if (root == null) {
            return;
        }

        if (level == 1) {

            System.out.print(root.data + " ");

        } else if (level > 1) {

            levelorder(root.left, level - 1);

            levelorder(root.right, level - 1);
        }
    }

    // levelorder traversal in Queue using linkedlist

    public void levelorderQbase(Node root){
        Queue<Node>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.println(curr.data+" ");

            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }

    // Helper Function
    public static String getvalue(Node node) {

        if (node == null) {
            return "null";
        }

        return node.data + "";
    }

    // Main Function
    public static void main(String[] args) {

        // Preorder Array
        int arr[] = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};

        // Build Tree
        Node root = buildtree(arr);

        System.out.println("Build Tree:");
        System.out.println("Root Node: " + getvalue(root));
        System.out.println("Left Node: " + getvalue(root.left));
        System.out.println("Right Node: " + getvalue(root.right));

        traversal t = new traversal();

        // Preorder
        System.out.println("\nPreorder:");
        t.preorder(root);

        // Inorder
        System.out.println("\n\nInorder:");
        t.inorder(root);

        // Postorder
        System.out.println("\n\nPostorder:");
        t.postorder(root);

        // level order in using Queue O(n)
        System.out.println("\n\n Level order using o(n) using Queue:");
        t.levelorderQbase(root);


        // Level Order O(n2)
        System.out.println("\n\nLevel Order using o(n2) recersively:");

        int h = t.height(root);

        for (int i = 1; i <= h; i++) {

            t.levelorder(root, i);

            System.out.println();
        }
    }
}