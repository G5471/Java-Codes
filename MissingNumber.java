public class MissingNumber{
    public static void main(String[] args) {
        int input[]={1,2,3,4,6,8,9,10};
        int register[]=new int[input.length];
        //for(int i=0;i<input.length;i++)
        for(int i : input){
            register[i]=1;
        }
        for(int i=1;i<register.length;i++){
            if(register[i]==0){
                System.out.println(i);
            }
        }
    }
}