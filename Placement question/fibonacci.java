//Write a program to generate the
//  first n numbers in the Fibonacci sequence. 

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        int a=0;
        int b=1;

         for(int i=1;i<=n;i++){
            System.out.println(a);
            
            int c=a+b;

            a=b;
            b=c;
         }
         

    }
}
