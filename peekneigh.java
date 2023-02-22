public class peekneigh {
    public static void main(String[] args){
        int[] arr = {3,6,45,65,34,76,12,45,78};
        for(int i=0;i<arr.length;i++){
            if(i!=0 && i!=arr.length-1){
                if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                    System.out.println(arr[i]);  
                   
                }
          }
          if(i==0 && arr[i]>=arr[i+1]){

            System.out.println(arr[i]);
            break;
        }
        else if(i==arr.length-1 && arr[i]>=arr[i-1]){
            
            System.out.println(arr[i]);
            break;
        }
        }
    }
}
