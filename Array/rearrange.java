import java.util.Arrays;

public class rearrange {
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};

        int result[] = new int[arr.length];
        
        int positivelist = 0;
        int negativelist = 1;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > 0){
                result[positivelist] = arr[i];
                positivelist += 2;
            } else {
                result[negativelist] = arr[i];
                negativelist += 2;
            }
            
        }

      
        for(int j = 0; j < result.length; j++){
            System.out.print(result[j] + " ");
        }
    }
}
