
//Merge Intervals OR Overlapping Intervals

//Problem Link:
//https://leetcode.com/problems/merge-intervals/description/
//https://practice.geeksforgeeks.org/problems/8a644e94faaa94968d8665ba9e0a80d1ae3e0a2d/1


import java.util.*;

public class Q14_MergeIntervals {

    //Optimal Approach:
    //TC: 0(nlogn)+0(n)
    //SC:0(n) //Return the merge intervals
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();

        int[] newInterval=intervals[0];

        for(int[] arr: intervals ){
            if(arr[0]<=newInterval[1]){
                newInterval[1]=Math.max(arr[1],newInterval[1]);
            }else{
                ans.add(newInterval);
                newInterval=arr;
            }
        }

        ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}
