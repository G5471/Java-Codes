public class Largest_And_Smallest {
    public static void main(String[] args) {
        int arr[]={12,3,5,6,8,99,52,45,20};
        int largest=arr[0];
        int Smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]> largest){
                largest=arr[i];
            }
            if(arr[i]<Smallest){
                Smallest=arr[i];
            }
        }
        System.out.println(Smallest);
        System.out.println(largest);
    }
}
