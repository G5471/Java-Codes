public class Shorting4 {
    public static void main(String[] args) {
        int arr[]={20,56,9,7,3,4,6,85,23};
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
