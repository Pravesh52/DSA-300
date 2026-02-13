//largest element

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={1,5,4,3,6,2};
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++ ){
                if(arr[i]>arr[j]){
                    max=arr[i];
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
