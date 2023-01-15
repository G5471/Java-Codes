public class MaximumArray{
    public static void main(String[] args) {
        int arr[]={10,20,30,45,89,22,12,33};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}