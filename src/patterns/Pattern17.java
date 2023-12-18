package patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char c='A';
            for(int k=0;k<2*i+1;k++){

                System.out.print(c);
                if(k<i)c++;
                else c--;
            }
            System.out.println();
        }


    }
}
