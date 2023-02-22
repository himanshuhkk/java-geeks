import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        for(int i=0; i<5;i++){
            if(arr[i] == key){
                System.out.println("index is : " + i);
            }
        }
    }   
}
