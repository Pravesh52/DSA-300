// import java.util.Arrays;

// public class threesum {
//     public static void main(String[] args) {
//         int arr[]={-1,0,1,2,-1,-4};

//         //output [-1,-1,2]
//         //        [-1,0,1]
//         Arrays.sort(arr);
//         int n=arr.length;

//          for(int i=0;i<n-2;i++){

//             for(int j=i+1;j<n-1;j++){

//                 for(int k=j+1;k<n;k++){

//                     if(arr[i]+arr[j]+arr[k]==0){
//                         System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                      
//                     }
//                 }
//             }
//          }
//     }

// }


//code optimization

import java.util.Arrays;

public class threesum {
    public static void main(String[] args) {

        int arr[] = {-1,0,1,2,-1,-4};
        
        Arrays.sort(arr);

        int n = arr.length;

        for(int i = 0; i < n - 2; i++) {

            // Skip duplicate fixed element
            if(i > 0 && arr[i] == arr[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while(left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);

                    // Skip duplicates
                    while(left < right && arr[left] == arr[left + 1])
                        left++;

                    while(left < right && arr[right] == arr[right - 1])
                        right--;

                    left++;
                    right--;
                }
                else if(sum < 0)
                    left++;
                else
                    right--;
            }
        }
    }
}

