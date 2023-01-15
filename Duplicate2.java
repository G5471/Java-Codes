public class Duplicate2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int arr2[]={85,16,89,7,3,7,5};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}