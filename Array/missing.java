import java.util.Arrays;

public class missing {
    public static void main(String[] args) {
        int arr[] = {3, 0, 1};

        //First Approach sorting based

        // Arrays.sort(arr);

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != i) {
        //         System.out.println("Missing Number: " + i);
        //         return;
        //     }
        // }
        // System.out.println("Missing Number: " + arr.length);

        //Second Approach Formula based

        int n=arr.length;

        int expectedsum=n*(n+1)/2;

        int actualsum=0;

        for(int num: arr){
            actualsum+=num;
        }
        int result=expectedsum-actualsum;

        System.out.println(result+" ");
    }
}
