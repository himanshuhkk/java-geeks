import java.util.Scanner;

public class pyr5 {
    //spiral traversal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        int top = 0 , down = n-1 , left = 0 , right = n-1;
        int dir = 0;
        int num = 1;
        while(top<=down && left<=right){
            if(dir == 0){
                for(int i=left;i<=right;i++){
                    arr[top][i] = num;
                    num++;
                }
                top++;
            }
            else if(dir == 1){
                for(int i=top;i<=down;i++){
                    arr[i][right] = num;
                    num++;
                }
                right--;
            }
            else if(dir == 2){
                for(int i=right;i>=left;i--){
                    arr[down][i] = num;
                    num++;
                }
                down--;
            }
            else if(dir == 3){
                for(int i=down;i>=top;i--){
                    arr[i][left] = num;
                    num++;
                }
                left++;
            }
            dir = (dir + 1)%4;
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(arr[row][col]);
            }
            System.out.println("");
        }


    }
}
