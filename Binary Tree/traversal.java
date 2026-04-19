// Binary Tree traversal


public class traversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){

            this.data=data;
            this.left=left;
            this.right=right;
        }

    }

   //   build tree using preorder 

     static int idx=-1;

    static Node buildtree(int[] preorder){
        idx++;

        if(idx>=preorder.length||preorder[idx]==-1){
            return null;
            
        }
       
        Node root=new Node(preorder[idx], null, null);

        root.left=buildtree(preorder); //left
        root.right=buildtree(preorder); //right

        return root;

    }


    // Inorder:



    // Postorder:


 public static String getvalue(Node node){
    if(node==null){
        return "null";
    }

    return node.data+" ";
 }

    public static void main(String[] args) {

        int preorder[]={1,2,-1,-1,3,4,-1,-1,5,-1};

        Node root=buildtree(preorder);

        System.out.println("Root Node: "+getvalue(root));
        System.out.println("left Node: "+getvalue(root.left));
        System.out.println("right Node: "+getvalue(root.right));
        System.out.println("right ke left me node: "+getvalue(root.right.left));
        System.out.println("left ke left me : "+getvalue(root.left.left));
        
    }
}
