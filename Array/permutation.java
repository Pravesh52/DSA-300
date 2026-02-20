//Leetcode:31. Next Permutation

public class permutation {
    public static void main(String[] args) {

        int arr[] = {1,2,3};
        int n = arr.length;
        int pivot = -1;

        // Step 1: Find pivot
        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot → reverse whole array
        if(pivot == -1){
            reverse(arr, 0, n-1);
        } else {

            // Step 3: Find rightmost greater element
            for(int i = n-1; i > pivot; i--){
                if(arr[i] > arr[pivot]){
                    int temp = arr[pivot];
                    arr[pivot] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }

            // Step 4: Reverse right half
            reverse(arr, pivot+1, n-1);
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}