// package Stack & Queue;

public class implementation {
    class stack{
        int arr[];
        int top;
        int size;

        stack(int size){
            this.size=size;
            arr=new int[size];
            top=-1;

        }

         // Push
        public void push(int x){
            if(top==size-1){
                System.out.println("Stack overflow...");
                return;
            }
            arr[++top]=x;
        }

        // Pop

        public void pop(){
            if(top==-1){
                System.out.println("Stack is empty..");
            }
            
        }

    }
   
    public static void main(String[] args) {
        
    }
}
