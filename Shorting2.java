public class Shorting2 {
    public static void main(String[] args) {
        int arr[]={10,9,56,78,2,3,6,4,7,9,5,6};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]+" ");
        }
    }
}
