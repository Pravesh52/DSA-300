//Search insert position

public class searchinsertpos {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target=5;

        // Output: 2

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                System.out.println("Search insert position: "+i+"");
            }
        }
        
    }   
}
