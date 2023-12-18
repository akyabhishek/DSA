package basicMaths;

public class CountDigits {
    public static void main(String[] args) {

        int num=400;
        int temp=num;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        System.out.println("Count - "+count);
    }
}
