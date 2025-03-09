package basicprograms;

import java.util.HashSet;
import java.util.Set;

public class LogestSubStringWithoutRepetedChar {
    public static void main(String args[]){
        String s="abcabcbc";
        int maxLength=0;
        int left=0;
        int start=0;
        Set<Character> set=new HashSet<>();
        for(int right=0;right<s.length();right++){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }

        String longestSubstring = s.substring(start, start + maxLength);
        System.out.println(longestSubstring);

    }
}
