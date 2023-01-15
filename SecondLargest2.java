public class SecondLargest2 {
    public static void main(String[] args) {
        int arr[]={12,30,50,90,55,60,77,66};
        int second=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<second){
                    second=arr[i];
                }
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}