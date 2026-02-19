//Merge sort

public class mergesort {
    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int m=3;
        int arr2[]={2,5,6};
        int n=3;

        int  i=m-1;
        int j=n-1;
        int index=m+n-1;

        while(i>=0 && j>=0){

            if(arr1[i]>=arr1[j]){
                arr1[index]=arr1[i];
                index--;
                i--;
            }else{
                arr1[index]=arr2[j];
                index--;
                j--;
            }
        }

      for(int k=0;k<arr1.length;k++){
        System.out.println("MergeSort: "+arr1[k]);
      }
    }
}
