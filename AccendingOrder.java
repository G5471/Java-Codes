public class AccendingOrder{
    public static void main(String[] args) {
        int arr[]={8,9,3,5,8,6,7,53,46,58,77};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]+" ");
        }
    }
} 