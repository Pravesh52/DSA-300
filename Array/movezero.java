//Move Zeros to End

public class movezero {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++)
           {
            if(arr[i]<arr[j]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
           }
        }
        for(int num: arr){
            System.out.println(num+" ");
        }

    }
}
