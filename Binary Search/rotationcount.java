//Rotation Count in a Rotated Sorted array

public class rotationcount {
    public static void main(String[] args) {
        int arr[]={15, 18, 2, 3, 6, 12};
        int min=arr[0];
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        System.out.println("Rotation count: "+index);

    }
}
