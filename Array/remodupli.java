//Remove duplicate from sorted array

public class remodupli {
    public static void main(String[] args) {
        int arr[]={4,5,8,5,9,3,8};


        //sort the array
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                  int temp=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Remove Duplicate: ");
        int result[]=new int[arr.length];
        int index=0;
        result[index] = arr[0];
        index++;

        for(int i=1;i<arr.length;i++){
           if(arr[i]!=arr[i-1]){
            result[index]=arr[i];
            index++;
           }
        }

       for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }    
}
