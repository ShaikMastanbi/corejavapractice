package basicprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharector {
    public static void main(String args[]){
        String s="Mastanbi";
        String s1=s.toLowerCase();
        char ch[]=s1.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],1);
            }
            else{
                map.put(ch[i], map.get(ch[i]) + 1);
            }

        }

            System.out.println(map);


    }
}
