//2965. Find Missing and Repeated Values

public class repeating {
    public static void main(String[] args) {
        int arr[][]={{9,1,7},
                     {8,9,2},
                     {3,4,6}};

        // Question: [9,1,7],[8,9,2],[3,4,6]
        //output: [9,5]

        int n=arr.length;
        int totalnumber=n*n;

        //find expected sum
        int expectedsum= totalnumber*(totalnumber+1)/2;

        //Actual sum 
        int actualsum=0;

        //frequencey count

        int freq[]=new int[totalnumber+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                actualsum+=arr[i][j];
                freq[arr[i][j]]++; 
            }
        }

        

        //difference find 
        
        int difference=actualsum-expectedsum;

        // System.out.println(difference);

        //find Repeated

        int repeated=0;
        int missing=-1;

        for(int i=1;i<=totalnumber;i++){
            if(freq[i]==2){
                repeated=i;
                break;
            }
        }

        //find missing

         missing=repeated-difference;

         System.out.println("Repeated value "+repeated);
         System.out.println("Missing value "+missing);


    }
}
