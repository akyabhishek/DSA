package basicMaths;

public class GCD {
    public static void main(String[] args) {
        int a=20,b=40;
        while(a>0 && b>0){
            if(a>b)a=a%b;
            else b=b%a;
        }
        if(a==0) System.out.println("GCD - "+b);
        else System.out.println("GCD - "+a);
    }
}
