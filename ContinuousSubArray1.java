public class ContinuousSubArray1 {
    static void FindSubArray(int arr[],int num){
        System.out.println("all array are: ");
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==num){
                    for(int k=i;k<=j;k++){
                        System.out.println(arr[k]+" ");
                    }
                }
                else if(sum > num){
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={15,16,17,10,3,2,5,25};
        int num=30;
        FindSubArray(arr, num);
    }
}
