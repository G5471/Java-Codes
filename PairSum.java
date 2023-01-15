public class PairSum {
    public static void PairSum(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        return;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,8,10,11};
        int sum=13;
        PairSum(arr, sum);
    }
}
