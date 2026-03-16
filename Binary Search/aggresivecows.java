
// Aggressive Cows

import java.util.Arrays;

public class aggresivecows {
    public static void main(String[] args) {
        int stalls[]={1, 2, 4, 8, 9};

        int k=3; //Numbers of cows

        Arrays.sort(stalls);//sort the stall

        int start = 1;

        int end=stalls[stalls.length-1]-stalls[0];

        int ans=0;

        //binary search

        while(start<=end){
            int mid=(start+end)/2;
//     // check karo ki mid distance par 
// cows place ho sakti hain ya nahi
          if(canplace(stalls, k, mid)){
            //agar ho sakti hai tho 
            ans=mid;

                // aur bada distance try karte hain
                start = mid + 1;
          }else{
             // agar cows place nahi ho sakti to distance kam karo
            end=mid-1;
          }
           // maximum minimum distance print karo
           
           
           
        }
        System.out.println(ans);
    }
    public static boolean canplace(int stalls[], int k, int dist){
             // first cow ko first stall me rakh dete hain
             int cows=1;

             // last placed cow ki position
             int last=stalls[0];

              // baaki stalls check karte hain

              for(int i=1;i<stalls.length;i++){
                 // agar current stall aur last cow ka distance
                 //  required distance se bada ya equal hai

                 if(stalls[i]-last>=dist){
                     // yaha cow place kar sakte hain
                      cows++;

                      last=stalls[i];//last cows ki position change
                 }
                 //agar k cows place ho sakti hai 
                 if(cows>=k){
                    return true;
                 }
                }
                //agar k cows place nahi ho sakti hai 
                return false;
    }
}
