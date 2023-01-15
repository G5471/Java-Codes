public class Largest {
    public static void main(String[] args) {
        int arr[]={4,55,6,3,28,99,77,8,58,42};
        int Largest1=arr[0];
        for(int i=0;i<arr.length;i++){
            if(Largest1<  arr[i]){
                Largest1=arr[i];
            }
        }
        System.out.println(Largest1);
    }
}
