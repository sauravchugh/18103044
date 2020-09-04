import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        int sum=0, j=1;
        for(; sum<Integer.MAX_VALUE && j<Integer.MAX_VALUE; j++) {
            if(sum+j>=Integer.MAX_VALUE)
                break;
            sum+=j;
            if(sum==j*j)
                System.out.println(j);
        }
    }
}