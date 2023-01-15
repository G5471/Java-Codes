// write a program to find second largest  element in an array of interger.....
public class SecondLargested {
    public static void main(String[] args) {
        int arr[]={45,89,56,23,56,88,75,64,80};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]> arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}
