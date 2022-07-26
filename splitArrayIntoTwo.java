import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int [] arr = {1,3,4,5,6};
        int n = arr.length;
        
        int [] a = new int[(n+1)/2];
        int [] b = new int [n - a.length];
        
        for(int i = 0; i < n ; i++){
            if(i < a.length){
                a[i] = arr[i];
            }else{
                b[i-a.length] = arr[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
