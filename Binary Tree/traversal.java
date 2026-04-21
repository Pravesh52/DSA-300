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

    static Node buildtree(int[] arr){
        idx++;

        if(idx>=arr.length||arr[idx]==-1){
            return null;
            
        }
       
        Node root=new Node(arr[idx], null, null);

        root.left=buildtree(arr); //left
        root.right=buildtree(arr); //right

        return root;

    }

    // Preorder

    public void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }




    // Inorder:
    public void Inorder(Node root){
        if(root==null) return;

        Inorder(root.left);
        System.out.println(root.data+" ");
        Inorder(root.right);
    }



    // Postorder:
    public void Postorder(Node root){
        if(root==null) return;

        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data+" ");
    }


    // Preorder to Inorder 





    


 public static String getvalue(Node node){
    if(node==null){
        return "null";
    }

    return node.data+" ";
 }

    public static void main(String[] args) {

        int arr[]={1,2,-1,-1,3,4,-1,-1,5,-1};

        Node root=buildtree(arr);

System.out.println("Build tree Preorder");

        System.out.println("Root Node: "+getvalue(root));
        System.out.println("left Node: "+getvalue(root.left));
        System.out.println("right Node: "+getvalue(root.right));
        System.out.println("right ke left me node: "+getvalue(root.right.left));
        System.out.println("left ke left me : "+getvalue(root.left.left));


        traversal t= new traversal();

        System.out.println("Preorder: ");
       t.preorder(root);

       System.out.println();

       System.out.println("Inorder:");
       t.Inorder(root);

       System.out.println();

       System.out.println("PostOrder:");
       t.Postorder(root);
        
    }
}
