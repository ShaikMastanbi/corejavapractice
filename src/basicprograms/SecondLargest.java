package basicprograms;

import java.util.HashSet;
import java.util.Set;

public class SecondLargest {
    public static void main(String args[]){
        int ar[]={2,5,7,8,9,4};
        int max=0;
        int secmax=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                secmax=max;
                max=ar[i];

            } else if (ar[i]>secmax && ar[i]!=max) {

                secmax = ar[i];
            }
        }
        System.out.println(secmax);
    }
}
