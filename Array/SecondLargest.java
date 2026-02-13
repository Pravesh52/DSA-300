//Second largest element

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={10, 25, 7, 40, 30};
        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
           if(arr[i]>largest){
            SecondLargest=largest;
            largest=arr[i];
           }else if(arr[i]>SecondLargest && arr[i]!=largest){
            SecondLargest=arr[i];
           }
        }

        if(SecondLargest==Integer.MIN_VALUE){
            System.out.println("Second largest is not exist ");

        }else{
            System.out.println("Second largest value: "+SecondLargest);
        }
    }
}
