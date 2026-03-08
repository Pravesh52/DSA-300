public class maxprosubarray {
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};

        int n=arr.length;

        int maxproduct=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int product=1;

            for(int j=i;j<n;j++){
                product=product*arr[j];

                if(product>maxproduct){
                    maxproduct=product;
                }
            }
        }
        System.out.println("Max Product: "+maxproduct);
    }
}
