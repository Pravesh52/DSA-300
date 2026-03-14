// package Placement question;
// Write a program to check if a given number
//  is a prime number. 

public class Prime {
    public static void main(String[] args) {
        int n=10;
        //check the prime number
        // boolean isprime=true;

        // if(n<=1){
        //     isprime=false;
        // }

        // for(int i=2;i<=n/2;i++){
        //     if(n%i==0){
        //         isprime=false;
        //         break;
        //     }
        // }
        // if(isprime){
        //     System.out.println("Prime number...");
        // }else{
        //     System.out.println("Not a prime number...");
        // }


        // Print the prime number

        for(int i=2;i<=n;i++){
            boolean isprime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }

        
    }
}
