
//Find if there is any subarray with sum equal to 0

//Problem Link:
//https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

import java.util.*;

public class Q21_SubarrayWith0Sum {

    //Optimal Approach : Prefix Sum Approach
    //TC: 0(n)
    //SC: 0(n)
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int sum=0;

        Set<Integer> pSum=new HashSet<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0 || arr[i]==0 || pSum.contains(sum)){
                return true;
            }
            pSum.add(sum);
        }

        return false;
    }
}
