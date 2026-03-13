// Ceil in a Sorted Array

public class ceil {
    public static void main(String[] args) {
        int arr[]={1, 2, 8, 10, 11, 12, 19};
        int x=5;

        /*Input: arr[] = [1, 2, 8, 10, 11, 12, 19],
         x = 5
        Output: 2
        Explanation: Smallest number greater than 5 is 8,
         whose index is 2. */
        int ceilidx=0;
         for(int i=0;i<arr.length;i++ ){
            if(arr[i]<x){
                ceilidx++;
            }else{
                break;
            }
         }
         System.out.println(ceilidx);
    }
    
}
