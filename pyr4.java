import java.util.Scanner;

public class pyr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for(int s =0;s<=n-i;s++)
            System.out.print(" ");
            for(int j=0;j<=i;j++){
                System.out.print(fact(i)/(fact(j)*fact(i-j))+" ");
            }
            System.out.println("");
        }
    }

    private static int fact(int i) {
        int fact=1;
        for(int j=1;j<=i;j++){ 
            fact = fact*j;           
        }
        return fact;
    }
}
