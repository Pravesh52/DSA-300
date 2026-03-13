//Write a program to sort an array of 
// integers using the bubble sort algorithm. 


public class Sorting {
    public static void main(String[] args) {
        int arr[]={4,8,9,5,1,2};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println("Bubble sort: "+arr[k]);
        }
    }
}
