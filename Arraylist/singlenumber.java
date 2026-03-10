//package Arraylist;

import java.util.ArrayList;

public class singlenumber {
    public static void main(String[] args) {
        int arr[]={2,2,1};
        
        //output 1

        ArrayList<Integer>list=new ArrayList<>();

        for(int num : arr){
            if(list.contains(num)){
                list.remove(Integer.valueOf(num));
            }else{
                list.add(num);
            }
        }
        System.out.println(list.get(0));
    }
}
