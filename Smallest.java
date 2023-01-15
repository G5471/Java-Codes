public class Smallest {
    public static void main(String[] args) {
        int arr[]={12,66,80,20,90,63,55,25};
        int Smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]< Smallest)
            Smallest=arr[i];
        }
        System.out.println(Smallest);
    }
}
