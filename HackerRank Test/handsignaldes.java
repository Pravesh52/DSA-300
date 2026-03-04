//HackerRank Question 1

import java.util.Scanner;

public class handsignaldes {
    public static void main(String[] args) {
        System.out.println("Enter 1 and 0 values:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Left Hand: ");
        int lefthand=sc.nextInt();
        System.out.println("Enter right hand: ");
        int righthand=sc.nextInt();

        //input only 0 and 1

        // boolean result=false;

        // lefthand=yes;
        // righthand=no;

        if(lefthand==0 && righthand==1){
            System.out.println("Yes");
        }else if(lefthand==1 && righthand==0){
            System.out.println("No");
        }else if(lefthand==1 && righthand==1){
            System.out.println("Invalid");
        }else if(lefthand==0 && righthand==0){
            System.out.println("invalid");
            
        }





    }
}
