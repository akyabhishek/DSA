package basicMaths;

public class Fibonacci {
    public static void main(String[] args) {
        int num=6;
        System.out.println(fibonacci(num));
    }

    private static int fibonacci(int num) {

        if(num<=1) return num;
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
