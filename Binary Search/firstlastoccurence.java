// First and Last occurence

public class firstlastoccurence {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x=5;
        /*
        Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125],
         x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and
 last occurrence of 5 is at index 5 */
        
         int firstindex=0;
         int lastindex=0;
         for(int i=0;i<arr.length-1;i++){
            if(arr[i]==x){
                if(firstindex==0){
                    firstindex=i;
                }
                lastindex=i;
            }
         }
         System.out.println(firstindex);
         System.out.println(lastindex);
    }
    
}
