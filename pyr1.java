import java.util.Scanner;

public class pyr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            int p = i;
            for(int j=1;j<=i;j++){
                System.out.print(p++);
            }
            int p1 = 2*i-2;
            for(int j=1;j<i;j++){
                if(i==1)
                continue;
                System.out.print(p1--);

            }
            System.out.println("");
        }
    }
}
