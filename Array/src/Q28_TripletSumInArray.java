
import java.util.*;

public class Q28_TripletSumInArray {
    //Gfg:
    //https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
    //Approach 1:
    //TC:0(nlogn+n^2) SC:0(1)
    public static boolean find3Numbers(int A[], int n, int X){
        Arrays.sort(A);
        for(int i=0;i<n-2;i++){
            int start=i+1;
            int end=n-1;

            while(start<end){
                if(A[i]+A[start]+A[end]==X){
                    return true;
                }else if(A[i]+A[start]+A[end]<X){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return false;
    }

    //Approach 2: Using HashSet
    //TC:O(n+n^2) SC:0(n)










    //Leetcode:3Sum
    //https://leetcode.com/problems/3sum/description/
    //TC:0(nlogn+n^2)  SC:0(n)
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        if(nums.length==0 || nums==null){
            return new ArrayList<>(ans);
        }


        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end= nums.length-1;

            while(start<end){
                int res=nums[i]+nums[start]+nums[end];
                if(res==0){
                    ans.add(new ArrayList<>(List.of(nums[i],nums[start],nums[end])));
                    start++;
                    end--;
                }else if(res<0){
                    start++;
                }else{
                    end--;
                }
            }

        }

        return new ArrayList<>(ans);
    }



}
