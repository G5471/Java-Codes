public class LargestNum {
    public static void main(String[] args) {
        int arr[] = { 12, 45, 6, 89, 55, 20, 62 };
        int Largest = arr[0];
        int smallest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
            if(arr[i]< smallest){
                smallest=arr[i];
            }
        }
        System.out.println(Largest);
        System.out.println(smallest);
    }
}
