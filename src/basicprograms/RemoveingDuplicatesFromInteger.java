package basicprograms;

import java.util.*;

public class RemoveingDuplicatesFromInteger {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(1,2,3,4,3,2,5);
       List<Integer> list2=new ArrayList<>();
       int count=0;
       for(int num:list){
          if(!list2.contains(num)){
              list2.add(num);
          }

       }
       System.out.println(list2);



    }
}
