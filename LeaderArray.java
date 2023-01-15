public class LeaderArray {
    public static void main(String[] args) {
        int arr[]={12,33,20,21,30,15};
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
