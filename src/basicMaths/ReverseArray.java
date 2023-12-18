package basicMaths;


import static java.util.Collections.swap;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,7};
        int i=0,n=arr.length-1;
        while(i<n){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;n--;
        }
        for (int x:arr
             ) {
            System.out.print(x+",");

        }

    }


}
