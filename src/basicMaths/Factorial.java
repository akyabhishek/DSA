package basicMaths;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number to find factorial -");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("Factorial of %d is %d",n,factorial(n));
    }

    private static int factorial(int n) {
        if(n==1) return 1;
        return n*factorial(n-1);
    }
}
