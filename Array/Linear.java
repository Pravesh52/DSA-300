//package Array;

public class Linear {
    public static void main(String[] args) {
        int arr[]={1,8,5,6,4,3};
        int target=8;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }
    }
}
