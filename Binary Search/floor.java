//Floor in a Sorted Array

public class floor {
    public static void main(String[] args) {
        int arr[]={1, 2, 8, 10, 10, 12, 19};
        int x=5;
        /*Input: arr[] = [1, 2, 8, 10, 10, 12, 19],
         x = 5
        Output: 1
        Explanation: Largest number less than or equal
         to 5 is 2, whose index is 1. */
        int flooridx=0;
         for(int i=0;i<arr.length;i++){
            
            if(arr[i]<=x){
                flooridx=i;
            }else{
                break;
            }
         }
         System.out.println(flooridx);
    }
    
}
