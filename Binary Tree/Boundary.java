import java.util.ArrayList;
import java.util.Stack;

// import maxDepth.Node;

public class Boundary {

   static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    // check leaf node

    static boolean checkleaf(Node node){
        if(node.left==null && node.right==null){
            return true;
        }
        return false;
    }

    // Add left boundary

    static void addleftboundary(Node node, ArrayList<Integer>answer){
       while(node!=null){

        if(checkleaf(node)==false){
            answer.add(node.data);
        }

        if(node.left!=null){
            node=node.left;
        }
        // if left does not exist 
        else{
            node=node.right;
        }

       }
    }

    // Add leaf node

    static void addleafnodes(Node node, ArrayList<Integer>answer){
        if(node==null){
            return ;
        }

        if(checkleaf(node)){
            answer.add(node.data);
            return;
        }

        addleafnodes(node.left, answer);
        addleafnodes(node.right, answer);
    }

    // Add right boundary

    static void addrightboundary(Node node,ArrayList<Integer>answer){
       Stack<Integer>stack=new Stack<>();

       if(node!=null){

        // leaf node skip
         if(checkleaf(node)==false){
            stack.push(node.data);
         }
        //  Move right side
        if(node.right!=null){
            node =node.right;
        }
        // else move to left
        else{
            node=node.left;
        }
       }
       while(stack.isEmpty()==false){
        answer.add(stack.pop());
       }
    }

    // Boundary Traversal of tree

    static ArrayList<Integer>Boundarytrav(Node root){
        ArrayList<Integer>answer=new ArrayList<>();

        if(root==null){
            return answer;
        }

        // add root node

        if(checkleaf(root)==false){
            answer.add(root.data);
        }

        // add left boundary

        addleftboundary(root.left,answer);

        // add leaf nodes
        addleafnodes(root, answer);

        // add right boundary
        addrightboundary(root.right, answer);

        return answer;

    }


    public static void main(String[] args) {
         /*
                     1
                  /     \
                 2       3
               /   \    / \
              4     5  6   7
                   / \
                  8   9
        */

        Node root=new Node(1);

         root.left=new Node(2);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.left.right.left=new Node(8);
         root.left.right.right=new Node(9);

         root.right=new Node(3);
         root.right.left=new Node(6);
         root.right.right=new Node(7);

        ArrayList<Integer>result=Boundarytrav(root);

        System.out.println("Boundary Traversal: ");

        for(int value: result){
            System.out.println(value+" ");
        }



        
    }
}
