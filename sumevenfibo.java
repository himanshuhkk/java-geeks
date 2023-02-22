import java.util.Scanner;

public class sumevenfibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumfibo(n);
    }

    private static void sumfibo(int n) {
        int sum = 0 , first = 0 , second = 1 , third = 1,count=0 , i=0;
        while(true){
            if(count==n)
            break;
            if(i%2==0){
                sum += first;
                count++;
            }
            first = second;
            second = third;
            third = first + second;
            i++;
        }
        System.out.println(sum);
    }
}
