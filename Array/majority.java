//Leetcode: 169. Majority Element

public class majority {
    public static void main(String[] args) {
        int arr[]={3,1,2,3};

        int candidate=0;
        int count=0;

        for(int num: arr){
            if(count==0){
                candidate=num;
            }

            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        System.out.println("Majority Element: "+candidate);

    }
}
