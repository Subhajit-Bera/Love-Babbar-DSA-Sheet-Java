
//Given an array of size n and a number k, fin all elements that appear more than " n/k " times.



import java.util.*;


public class Q25_MoreThanNKOccurences {
    //Gfg:
    //https://practice.geeksforgeeks.org/problems/count-element-occurences/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
    //TC: O(n)
    //SC:0(n) Hashmap
    public int countOccurence(int[] arr, int n, int k)
    {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        int val=n/k;
        int count=0;
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            if(e.getValue()>val){
                count++;
            }
        }
        return count;
    }

    //Leetcode : Majority Element II : Elements appear more than (n/3) times.
    //https://leetcode.com/problems/majority-element-ii/
    //TC: 0(n)
    //SC:0(n) Hashmap
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        // if(nums.length==1){
        //     ans.add(nums[0]);
        //     return ans;
        // }

        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){

            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        int n=nums.length/3;
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            if(e.getValue()>n){
                ans.add(e.getKey());
            }
        }

        return ans;
    }


}
