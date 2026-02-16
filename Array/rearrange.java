//Rearrange array elements by sign

import java.util.Arrays;

public class rearrange {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        // int i=0;
        //Output: [3,-2,1,-5,2,-4]

        int n=arr.length;

        int positivelist=0;
        int negativelist=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            positivelist++;
        }else{
            negativelist++;
        }
        System.out.println(positivelist[i]);
        System.out.println(negativelist[i]);
    }



       
    }
}
