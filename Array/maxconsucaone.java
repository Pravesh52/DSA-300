//Leetcode Problem 485. Max Consecutive Ones

public class maxconsucaone {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        int currentcount=0;
        int maxcount=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==1){
                currentcount++;
                maxcount=Math.max(currentcount,maxcount);
            }else{
                currentcount=0;
            }
        }

        System.out.println(maxcount);
    }
}
