public class ConsecutiveOneORZero {
    static int max(int arr[]){
        int a=0;
        int maximum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                a++;
            }else{
                a=0;
            }maximum=Math.max(maximum, a);
        }
        return maximum;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,0,0,1,1,1,1};
        System.out.println(max(arr));
    }
}
