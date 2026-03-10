//package Arraylist;

import java.util.ArrayList;

public class sortcolors {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        //output: 0,0,1,1,2,2
        int zero=0,  one=0, two=0;
        
        for(int num: arr){
            if(num==0){
                zero++;
            }else if(num==1){
                one++;
            }else if(num==2){
                two++;
            }
        }
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<zero;i++){
            list.add(0);
        }
        for(int i=0;i<one;i++){
            list.add(1);
        }
        for(int i=0;i<two;i++){
            list.add(2);
        }

        System.out.println(list);
    }
}
