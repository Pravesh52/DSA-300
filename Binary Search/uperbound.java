//Upper Bound

public class uperbound {
    public static void main(String[] args) {
        int arr[]={2, 3, 7, 10, 11, 11, 25};

        int target=11;

       for(int i=0;i<arr.length;i++){
          if(arr[i]>target){
            System.out.println(i+" ");
            break;
          }
       }

    }
    
}
