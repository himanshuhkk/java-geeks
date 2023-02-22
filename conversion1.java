import java.util.Scanner;

public class conversion1 {
    public static void main(String[] args) {
        //Binary to octal
        Scanner sc = new Scanner(System.in);
        long binary = sc.nextLong();
        int decimal = bintodec(binary);
        System.out.println("Decimal is : " + decimal);
        int octal = dectooct(decimal);
        System.out.println("Octal is : " + octal);
    }

    
    private static int bintodec(long binary) {
        int i=0 , decimal = 0;
        while(binary!=0){
            decimal = decimal + (int)(Math.pow(2 , i++)*(binary%10));
            binary/=10;
        }
        return decimal;
    }
    private static int dectooct(int decimal) {
        int octal=0 , i=0;
        while(decimal!=0){
            octal = octal + (int)((decimal%8)*Math.pow(10, i++));
            decimal/=8;
        }
        return octal;
    }
}
