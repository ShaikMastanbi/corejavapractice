package basicprograms;

import java.util.*;

public class MissingNumber {
    public static void main(String args[]){
        int ar[]={1,2,5,6};
        int min= Arrays.stream(ar).min().getAsInt();
        int max=Arrays.stream(ar).max().getAsInt();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<ar.length;i++){

                set.add(ar[i]);

        }
        List<Integer> num=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                num.add(i);
            }


        }
        System.out.println(num);
    }
}
