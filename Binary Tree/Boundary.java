import java.util.ArrayList;

import maxDepth.Node;

public class Boundary {

    Node class{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    // check leaf node

    static boolean checkleaf(Node root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }

    // Add left boundary

    static addleftboundary(Node root, Arraylist<Integer>answer){
       while(root!=null){

        if(checkleaf(node)==false){
            answer.add(node.data);
        }

        if(root.left!=null){
            root=root.left
        }
        // if left does not exist 
        else{
            root=root.right;
        }

       }
    }

    // Add leaf node

    static void addleafnodes(Node node, ArrayList<Integer>answer){
        if(node==null){
            return answer;
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
    }




     


    public static void main(String[] args) {
        
    }
}
