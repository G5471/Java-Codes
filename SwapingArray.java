import java.util.Arrays;

public class SwapingArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int arr1[] = { 5, 6, 7, 8 };
        if(arr.length==arr1.length){
            int temp;
            for(int i=0;i<arr.length;i++){
                temp=arr[i];
                arr[i]=arr1[i];
                arr1[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
