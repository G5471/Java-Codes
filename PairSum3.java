public class PairSum3 {
    public static void pairSum(int arr[],int pair){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==pair){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4, 5, 2, 7, 6, 3, 22, 11};
        int pair=9;
        pairSum(arr, pair);
    }
}
