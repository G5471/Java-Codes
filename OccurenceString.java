public class OccurenceString {
    public static void main(String[] args) {
        String str=" You are a good boys";
        char ch='o';
        int a=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch)
                a++;
        }
        System.out.println(ch+" "+a);
    }
}
