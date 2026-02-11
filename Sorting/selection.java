package Sorting;

public class selection {
    public static void main(String[] args) {
        int arr[]={64, 25, 12, 22, 11};

        for(int i=0;i<arr.length-1;i++)
        {
            int minindex=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }

        // Correct Printing
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
