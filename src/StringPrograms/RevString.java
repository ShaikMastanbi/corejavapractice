package StringPrograms;

public class RevString {
    public static void main(String[] args) {
        String s="hello";
        char ch;
        String rev=" ";
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
    }
}
