import java.util.Scanner;
import java.math.*;

public class armstrongbtwnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        arms(n1,n2);
    }

    private static void arms(int n1, int n2) {
        for(int i=n1+1;i<n2;i++){
            int count = 0;
            int temp = i;
            while(temp>0){
                temp= temp/10;
                count++;
            }
            temp = i;
            int sum = 0;
            while(temp>0){
                int rem = temp%10;
                sum = sum + (int)Math.pow(rem, count);
                temp = temp/10;
            }
            if(sum==i){
                System.out.print(i+" ");
            }
        }
    }
}
