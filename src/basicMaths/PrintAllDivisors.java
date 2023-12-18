package basicMaths;

import java.util.*;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number-");
        List<Integer> divisors=new ArrayList<>();
        int num=sc.nextInt();
        for(int i=1;num>=i*i;i++){
            if(num%i==0) {
                divisors.add(i);
                if ((num / i) != i) {
                    divisors.add(num / i);
                }
            }
        }
        Collections.sort(divisors);
        for (int div:divisors){
            System.out.print(div + ",");
        }
    }
}
