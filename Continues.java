public class Continues {
    public static void main(String[] args) {
        int arr[]={5, 4, 1, 2, 3, 4, 1, 4, 5, 5};
        int sum=10;
        equalSum(arr,sum);
    }
    public static void equalSum(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
