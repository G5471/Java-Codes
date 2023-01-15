
public class FindOdd {
    public static void main(String[] args) {
        int i = 0;
        int num=0;
        int num2=0;
        do{
            if(i%2==0)
            num+(i);
            else
            num2+(i);
            i++;
        }while(i<=50);
        System.out.println(num+" "+num2);

    }
}