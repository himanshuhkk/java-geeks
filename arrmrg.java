import java.util.Arrays;

public class arrmrg {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,6};
        int b[] = {5,7,8,9,10};
        int []c = new int[10];
        int x = 0 , y = 0 , i = 0;
        for(i=0;i<(a.length+b.length);i++){
            if(x==5 || y==5)
            break;
            if(x!=5 &&y!=5){
                if(a[x]<=b[y]){
                        c[i] = a[x];
                        x++;
                        
                    }   
            else if(b[y]<a[x]){
                c[i] = b[y];
                y++;
            }
            }
        }
        while(x<5 && i<10){
            c[i] = a[x];
            i++;
            x++;
        }
        while(y<5 && i<10){
            c[i] = b[y];
            i++;
            y++;
        }
        System.out.println(Arrays.toString(c));
    }
}
