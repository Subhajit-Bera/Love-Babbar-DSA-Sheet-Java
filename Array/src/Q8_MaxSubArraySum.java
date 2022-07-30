//Find Largest sum contiguous Subarray [V. IMP]


//Problem Link:
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1#
//https://leetcode.com/problems/maximum-subarray/

//TC:O(n)
public class Q8_MaxSubArraySum {
    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0;i<nums.length;i++){
            curSum=Math.max(curSum+nums[i],nums[i]);
            maxSum=Math.max(maxSum,curSum);
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
