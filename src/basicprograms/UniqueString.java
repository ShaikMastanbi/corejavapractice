package basicprograms;

public class UniqueString {
    public static void main(String[] args) {
        String s="javadajava";
        String s1=" ";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!ischarecter(s,ch)){
                s1=s1+ch;
            }

        }
        System.out.println(s1);
    }

    public static boolean ischarecter(String s, char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return true;
            }
        }
        return false;
    }
}
