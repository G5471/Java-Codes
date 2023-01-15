public class LargestNumber{
    public static void main(String[] args) {
        int arr[]={14,52,96,88,20,30,40};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest < arr[i]){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}