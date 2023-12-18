package basicMaths;

import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check Amrstrong-");
        int num=sc.nextInt();
        int temp=num,sum=0;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=num;
        while(temp>0){
            int digit=temp%10;
            sum= (int) (sum+Math.pow(digit,count));
            temp=temp/10;
        }
        if(sum==num) System.out.println("Armstrong number");
        else System.out.println("Not armstrong ");
    }
}
