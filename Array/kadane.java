//Kadane's Algorithm
//Maximum subarray sum

public class kadane {
    public static void main(String[] args) {
        int arr[]={3,-4,5,4,-1,7,8};

        //simple loop se print

        // for(int start=0;start<arr.length;start++){
        //     for(int end=start;end<arr.length;end++){
        //         for(int i=start;i<=end;i++){
        //             System.out.print(arr[i]);
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }


        //Brute Force Approach

        // int maxsum=0;
        // for(int start=0;start<arr.length;start++){
        //     int currentsum=0;
        //     for(int end=0;end<arr.length;end++){

        //         currentsum+=arr[end];
        //          maxsum=Math.max(currentsum, maxsum);

        //     }
        // }
        // System.out.println("Maximum subarray Sum: "+maxsum);

        //Kadane's algorithm Maximum subarray sum
        
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            maxsum=Math.max(currentsum,maxsum);

            if(currentsum<=0){
                currentsum=0;
            }
        }

        System.out.println("Maximum subarray sum: "+maxsum);


    }
}
