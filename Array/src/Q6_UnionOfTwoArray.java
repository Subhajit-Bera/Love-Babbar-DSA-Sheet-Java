

//Problem Link:
//https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1#


//TC:O(n+m)  SC:O(n+m)

import java.util.Arrays;
import java.util.HashSet;

public class Q6_UnionOfTwoArray {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<m;i++){
            hs.add(b[i]);
        }
        return hs.size();

    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
    }
}
