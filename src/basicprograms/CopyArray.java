package basicprograms;

public class CopyArray {
    public static void main(String[] args) {
        int ar[]={-1,-2,-3,-4};
        int ar1[]={1,2,3,4};
        int ar2[]=new int[ar.length+ ar1.length];
        for (int i = 0; i < ar.length; i++) {
            ar2[i] = ar[i];
        }

        // Copy elements from `ar1` to `ar2`
        for (int i = 0; i < ar1.length; i++) {
            ar2[ar.length + i] = ar1[i];
        }

        for(int k=0;k<ar2.length;k++){
            System.out.println(ar[k]);
        }

    }
}
