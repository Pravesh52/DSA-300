//package Binary Search;

//Search X in sorted array

public class binarysearch {
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int target=9;

        //output: 4

        for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
            System.out.println(i);
           }
        }


    }
}
