public class majority {
    public static void main(String[] args) {

        int arr[] = {3,1,2,3};
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int freq = 0;

            for(int j = 1; j < n; j++){
                if(arr[i] == arr[j]){
                    freq++;
                }
            }

            if(freq > n/2){
                System.out.println("Majority element: " + arr[i]);
                return;
            }
        }

        System.out.println("No Majority Element");
    }
}