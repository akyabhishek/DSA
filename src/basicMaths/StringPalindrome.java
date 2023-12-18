package basicMaths;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string- ");
        String st=sc.nextLine();
        if(checkPalindrome(0,st,st.length()-1)){
            System.out.println("Palindrome");
        }else System.out.println("Not palindrome");
    }

    private static boolean checkPalindrome(int l,String st,int r) {
        if(l==r) return true;
        if(st.charAt(l)!=st.charAt(r)) return false;
        return checkPalindrome(++l,st,--r);
    }
}
