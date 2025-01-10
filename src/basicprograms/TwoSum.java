package basicprograms;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){


        int ar[]={1,2,7,5,11};
        int target=9;
        int[] result=twosum(ar,target);
        int[] ar1={3,6,7,8};
        int target1=9;
        int[] result1=twosum(ar1,target1);

        System.out.println("Test Case 1: Indices = [" + result[0] + ", " + result[1] + "]");
        System.out.println("Test Case 2: Indices = [" + result1[0] + ", " + result1[1] + "]");



    }
    public static int[] twosum(int num[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length;i++){
            int complement=target-num[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(num[i],i);
        }

        throw new IllegalArgumentException("No solution found");
    }

}
