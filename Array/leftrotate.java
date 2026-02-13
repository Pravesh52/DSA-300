//GFG  Problem Rotate Array By One

public class leftrotate {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int lastelement=arr[arr.length-1];

        //int result[]=new int[arr.length];

        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=lastelement;
       
       for(int num: arr){
        System.out.println(num+" ");
       }
    }
}
