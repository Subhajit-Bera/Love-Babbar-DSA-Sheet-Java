
//Find longest coinsecutive subsequence


//Problem Link :
//https://leetcode.com/problems/longest-consecutive-sequence/description/
//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1



   //Brute Force:  TC:0(nlogn)+0(n)   SC:0(n) if we perform merge sort need extra space
    //(i) Sort the array
   //(ii) Find and compare the length of every consecutive subsequence
  //(iii) Return the max length ;

import java.util.*;
public class Q24_LongestConsecutiveSequence {
    //Optimal Approach: Using HashSet
    //TC:0(n)+0(n)+0(n) -> 0(3n)
    //SC:0(1)
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();

        for(int i: nums){
            hs.add(i);
        }

        int maxSubSeq=0;
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]-1)){
                continue;
            }

            int curSubSeq=1;
            int j=1;
            while(hs.contains(nums[i]+j)){
                j++;
                curSubSeq++;
            }

            maxSubSeq=Math.max(maxSubSeq,curSubSeq);
        }

        return maxSubSeq;
    }
}
