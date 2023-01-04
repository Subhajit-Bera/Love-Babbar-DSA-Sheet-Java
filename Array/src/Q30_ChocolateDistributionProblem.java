

//Chocolate Distribution problem


//Problem Link:
//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

import java.util.*;


public class Q30_ChocolateDistributionProblem {
    //TC:0(nlogn)+0(n)  SC:0(1)
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int start=0;
        int end=0;
        long diff=Long.MAX_VALUE;

        while(end<a.size()){
            if(end-start+1<m){
                end++;
            }else if(end-start+1==m){
                long curDiff=a.get(end)-a.get(start);
                diff=Math.min(diff,curDiff);
                start++;
                end++;
            }
        }

        return diff;
    }
}
