package basicMaths;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check palindrome-");
        int temp= sc.nextInt();
        int num=temp;
        int rev=0;
        while(temp>0){
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        if(num==rev){
            System.out.println("Palindrome");
        }else System.out.println("Not palindrome");
    }
}
