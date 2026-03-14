//package Placement question;
//merge two sorted array

public class mergesorted {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={7,8,9,10,11};

        int result[]=new int[arr1.length+arr2.length];
        int resultidx=0;

       int i=0 ,j=0 , k=0;

       while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j]){
            result[k]=arr1[i];
            i++;
           
        }else{
            result[k]=arr2[j];
          
            j++;
        }
         k++;

       }

       while(i<arr1.length){
        result[k]=arr1[i];
        i++;
        k++;
       }
       while(j<arr2.length){
        result[k]=arr2[j];
        j++;
        k++;
       }

        for( k=0;k<result.length;k++){
            System.out.println(result[k]);
        }
    }
}
