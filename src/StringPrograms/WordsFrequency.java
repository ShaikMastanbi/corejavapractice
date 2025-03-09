package StringPrograms;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class WordsFrequency {
    public static void main(String[] args) {
        String s="hello wolrd hello java java learn";

        String words[]=s.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i< words.length;i++){
            if(!map.containsKey(words[i])){
                map.put(words[i],1);
            }
            else{
                map.put(words[i],map.get(words[i])+1);
            }
        }
        System.out.println(map);
    }
}
