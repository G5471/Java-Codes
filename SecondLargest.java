import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={55,22,5,3,89,60};
        int largest=0;
        int SecondLargest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>SecondLargest){
                SecondLargest=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(SecondLargest);
    }
}
