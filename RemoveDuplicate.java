public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2,2, 3, 4, 4,7,7, 3, 8};
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len-1;j++){
                if(arr[i]==arr[j] && arr[i]!=-1){
                    arr[i]=-1;
                }
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i]!=-1){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
