
//Find longest coinsecutive subsequence


//Problem Link :
//https://leetcode.com/problems/longest-consecutive-sequence/description/
//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1





import java.util.*;
public class Q24_LongestConsecutiveSequence {


    //Brute Force:  TC:0(nlogn)+0(n)   SC:0(n) if we perform merge sort need extra space
    //(i) Sort the array
    //(ii) Find and compare the length of every consecutive subsequence
    //(iii) Return the max length ;

//    public int longestConsecutive(int[] nums) {
//        if(nums.length<2 || nums==null){
//            return nums.length;
//        }
//
//
//        Arrays.sort(nums);
//        int maxCons=0;
//        int curCons=1;
//        int prevEle=nums[0];
//
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]==prevEle+1){
//                curCons++;
//            }else if(nums[i]!=prevEle){
//                curCons=1;
//            }
//            maxCons=Math.max(maxCons,curCons);
//            prevEle=nums[i];
//        }
//
//        return maxCons;
//
//    }






    //Optimal Approach: Using HashSet
    //TC:0(n)+0(n)+0(n) -> 0(3n)
    //SC:0(1)
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();

        for(int i: nums){  //0(n)
            hs.add(i);
        }

        int maxSubSeq=0;
        for(int i=0;i<nums.length;i++){  //0(n)
            if(hs.contains(nums[i]-1)){  //Finding the minimal number of a consecutive
                continue;
            }


            //When get the minimal number of a consecutive set then ,
            // start to find next bigger  consecutive numbers present in the HashSet (num+1,num+2....)
            int curSubSeq=1;
            int j=1;
            while(hs.contains(nums[i]+j)){  //0(n)
                j++;
                curSubSeq++;
            }

            maxSubSeq=Math.max(maxSubSeq,curSubSeq);
        }

        return maxSubSeq;
    }
}
