package basicprograms;

import java.util.Locale;

public class RemoveDuplicateChar {
    public static void main(String args[]){
        String s="Helloworld";
        String s1=s.toLowerCase();
        char ch[]=s1.toCharArray();

        for(int i=0;i<ch.length;i++){
            boolean isDuplicate = false;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    isDuplicate = true;
                    ch[j] = 0;
                }
            }
            if(!isDuplicate&&ch[i]!=0){
                System.out.println(ch[i]);
            }

        }
    }
}
