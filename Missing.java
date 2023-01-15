public class Missing {
    public static int Missing(int arr[]){
        int a=arr.length;
        int total=1;
        for(int i=2;i<=(a+1);i++){
            total += i;
            total -= arr[i-2];
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(Missing(arr));
    }
}
