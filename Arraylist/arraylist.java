// package Arraylist;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // int arr[]={1,2,7,4,5,6};

        ArrayList<Integer>list=new ArrayList<>();

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);

        // list.contains()
        int max=list.get(0);
        for (int num:list){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Max: "+max);
        int min=list.get(0);
        for (int num:list){
            if(num<min){
                min=num;
            }
        }
        System.out.println("Min: "+min);

        //sum
        int sum=0;

        for(int num : list){
            sum+=num;
        }
        System.out.println("Sum: "+sum);

        //average

        double avg=(double) sum/list.size();
        System.out.println("Average: "+avg);

        //reverse
System.out.println("Reverse: ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
        //even and odd
        int ce=0;
        int co=0;
        for(int num:list){
            if(num%2==0){
                ce++;
            }else{
                co++;
            }
        }
        System.out.println("");
        System.out.println("Even: " + ce + " " +"Odd: "+ co);

        //Second Largest

        int smin=0;
        for(int num:list){
            if(num<min){
                smin=num;
            }
        }
        System.out.println(smin);

        int smax=0;
        for(int num:list){
            if(num<max){
                smax=num;
            }
        }
        System.out.println(smax);

        //swap

        list.add(10);
        list.add(20);

         int temp = list.get(0);      
        list.set(0, list.get(1));    
        list.set(1, temp);
        System.out.println(list);


    }
}
