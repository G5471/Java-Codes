
public class Encapusalution {
    private int value;
    public void setvalue(int x){
        value=x;
    }
    public int getvalue(){
        return value;
    }
    public static void main(String[] args) {
        Encapusalution r=new Encapusalution();
        r.setvalue(1000);
        System.out.println(r.getvalue());
    }
}
