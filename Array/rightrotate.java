////GFG  Problem Rotate Array By One
public class rightrotate {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int firstele=arr[0];
        //int result[]=new int[arr.length];

        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstele;

        for(int num: arr){
            System.out.println(num+" ");
        }

    }
}
