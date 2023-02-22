public class arr2 {
    public static void main(String[] args) {
        int arr[] = {111,222,333,232,54};
        int max = arr[0];
        for(int i=0;i<5;i++){
            if(arr[i]>max)
            max = arr[i];
        }
        System.out.println(max);

}
}
