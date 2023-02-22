import java.util.Scanner;

public class pyr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            for (int j1 = 1; j1 < i; j1++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
