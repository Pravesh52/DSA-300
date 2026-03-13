//Find max and min in array

public class maxmin {
    public static void main(String[] args) {
        int arr[]={8,4,7,6,3,2};

        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }else if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
    
}
