package StringPrograms;

public class PrintEachChaRAtOnce {
    public static void main(String args[]){
        String s="javajavajavajavaja";
        String un="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(un.indexOf(ch)==-1){//indexOf() return -1 if string or char not present
                un=un+ch;
            }
        }
        System.out.println(un);
    }
}
