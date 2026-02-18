//Leetcode 48. Rotate Image

public class Rotateimage {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};

        /*output:7 4 1
                 8 5 2
                 9 6 3*/
        
        //pahle row ko column me convert

        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                 System.out.print(arr[i][j]+" ");

                 /*
                 1 4 7
                 5 8 9 */
               
            }
           
        }

        //fir usko reverse karenge

        for(int i=0;i<n;i++){
           
                int start=0;
                int end= n-1;

                while(start<end){
                    int temp=arr[i][start];
                    arr[i][start]=arr[i][end];
                    arr[i][end]=temp;

                    start++;
                    end--;
                }

            
        }

        // //print

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
