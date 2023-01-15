public class AccendingOrde {
    public static void main(String[] args) {
        int arr[]={9,5,3,7,8,6,4,44,92,65,8,60};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]+" ");
        }
    }
}
