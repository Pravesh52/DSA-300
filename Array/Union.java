//Union of two sorted arrays

import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int arr1[]={1, 2, 4, 5, 6};
        int arr2[]={2, 3, 5, 7};

        int result[]=new int[7];
        int index=0;
       
        for(int i=0;i<arr1.length;i++){
            result[index]=arr1[i];
            index++;
        }
        


        for(int j=0;j<arr2.length;j++){
            boolean found=false;
            for(int k=0;k<result.length;k++){
                if(arr2[j]==result[k]){
                    found=true;
                    break;
                }
            } 
            if(!found){
                result[index]=arr2[j];
                index++;
            }

        }
        Arrays.sort(result);

        for(int num: result){
            System.out.println(num+" ");
        }
    }
}
