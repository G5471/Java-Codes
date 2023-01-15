public class RevereStr {
    public static void main(String[] args) {
        String str="Learn java";
        String str2=" ";
        int SC=str.length();
        for(int i=SC-1;i>=0;i--){
            str2=str2+ str.charAt(i);
        }
        System.out.println(str2);
    }
}
