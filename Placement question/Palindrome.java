// package Placement question;
//Write a program to check if
// a given string is a palindrome.
public class Palindrome {
    public static void main(String[] args) {
        String str="madam";
        boolean ispalindrome=true;

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                ispalindrome=false;
                break;
            }
        }
        if(ispalindrome){
            System.out.println("String are palindrome....");
        }else{
            System.out.println("Not a Palindrome....");
        }
    }
}
