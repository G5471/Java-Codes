public class Range2 {
    public static void main(String[] args) {
        int digit=2;
        int x=35;
        int count=0;
        for(int i=0;i<=x;i++){
            int n=i;
            while(n>0){
                int model=n%10;
                n=n/10;
                if(model==digit){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
