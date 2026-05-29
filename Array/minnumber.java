public class minnumber {
    public static void main(String[] args) {
        int arr[]={10, 20,56,48};
        int min=Integer.MAX_VALUE;


        for(int num:arr){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num=num/10;
            }
            min=Math.min(sum, min);
            
        }
        System.out.println("Minimum sum number: "+min);
    }
    
}
