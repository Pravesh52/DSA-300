// Minimum days for M bouquets

public class bouquets {

    public static void main(String[] args) {

        // flower bloom days
        int[] bloomDay = {1,10,3,10,2};

        // number of bouquets needed
        int m = 3;

        // flowers required for one bouquet
        int k = 1;

        // call function to find minimum days
        int ans = minDays(bloomDay, m, k);

        // print answer
        System.out.println(ans);
    }


    public static int minDays(int[] bloomDay, int m, int k){

        // total flowers needed
        long need = (long)m * k;

        // if flowers needed > total flowers available
        // then it is impossible to make bouquets
        if(need > bloomDay.length){
            return -1;
        }

        // start = minimum bloom day
        int start = Integer.MAX_VALUE;

        // end = maximum bloom day
        int end = Integer.MIN_VALUE;

        // find minimum and maximum day in array
        for(int day : bloomDay){
            start = Math.min(start, day);
            end = Math.max(end, day);
        }

        // variable to store final answer
        int ans = -1;

        // binary search on days
        while(start <= end){

            // middle day
            int mid = start + (end - start) / 2;

            // check if bouquets can be made by this day
            if(canmake(bloomDay, m, k, mid)){

                // store possible answer
                ans = mid;

                // try to find smaller day
                end = mid - 1;

            }else{

                // not possible → need more days
                start = mid + 1;
            }
        }

        // return minimum day
        return ans;
    }


    public static boolean canmake(int[] bloomDay, int m, int k, int day){

        // count consecutive bloomed flowers
        int flowers = 0;

        // count bouquets formed
        int bouquets = 0;

        // traverse all flowers
        for(int bloom : bloomDay){

            // if flower has bloomed by given day
            if(bloom <= day){
                flowers++;
            }
            else{

                // make bouquets from consecutive flowers
                bouquets += flowers / k;

                // reset counter
                flowers = 0;
            }
        }

        // handle last group of flowers
        bouquets += flowers / k;

        // check if we can make at least m bouquets
        return bouquets >= m;
    }
}