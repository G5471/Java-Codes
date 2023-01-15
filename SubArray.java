public class SubArray {
    public static int MaxSubArray(int arr[]){
        int Max=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum<0){
                sum=arr[i];
            }else{
                sum=sum+arr[i];
            }
            Max=Math.max(Max, sum);
        }
        return Max;
    }

    public static void main(String[] args) {
        int arr[]={1,2,-5,4,3,8,5};//4+3+8+5=20(output)
        int result=MaxSubArray(arr);
        System.out.println(result );
    }
}
