//Upper Bound

public class uperbound {
    public static void main(String[] args) {
        int arr[]={2, 3, 7, 10, 11, 11, 25};

        int target=9;

        //result: Output: 3
// Explanation: 3 is the smallest 
// index in arr[] where element (arr[3] = 10) is greater than 
// or equal to 9.

       for(int i=0;i<arr.length;i++){
          if(arr[i]>=target){
            System.out.println(i+" ");
            break;
          }
       }

    }
    
}
