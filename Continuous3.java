public class Continuous3 {
    public static void ContinuousSubArray(int arr[],int num){
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
        int arr[]={10,20,30,40,45,5};
        int num=50;
        ContinuousSubArray(arr, num);
    }
}
