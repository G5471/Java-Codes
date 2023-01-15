public class PairSum2{
    public static void main(String[] args) {
        int num[]={1,2,3,5,6,9,7,8};
        int sum=15;
        PairSum(num, sum);
    }
    public static void PairSum(int num[], int sum){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==sum){
                    System.out.println(num[i]+" "+num[j]);
                }
            }
        }
    }
}