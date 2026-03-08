public class reversepair {
    public static void main(String[] args) {
        int arr[]={1,3,2,3,1};
        int count=0;

        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>2*arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
