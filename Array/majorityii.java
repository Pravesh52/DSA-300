//majority element ii

public class majorityii {
    public static void main(String[] args) {
        // int arr[]={1,2,1,2,1,1};
        int arr[]={3,2,3};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int freq=0;

            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }

            if(freq>n/3){
                System.out.println("Majority Element: "+arr[i]);
                return;
            }
        }
    }
}
