public class Find_Duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr2[]={7,8,9,6,5,2,3,4};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
}
