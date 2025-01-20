package basicprograms;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
    public static void main(String args[]){
        int ar[]={1,33,44,55,98};
        boolean status=true;
        for(int i=1;i<100;i++){
            for(int j=0;j<ar.length;j++){
                if(i == ar[j]){
                   status=false;
                    break;
                }
            }
            if(status==true){
                System.out.println(i);
            }
            status = true;
        }



    }
}
