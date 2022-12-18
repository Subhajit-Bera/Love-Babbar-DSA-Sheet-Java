//Find maximum product subarray


//Problem Link:
//https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1
//https://leetcode.com/problems/maximum-product-subarray/submissions/861219524/

public class Q23_MaximumProductSubarray {
    //TC:0(n)
    //SC:0(1)
    //Gfg:
    long maxProduct(int[] arr, int n){
        long max=1;
        long min=1;
        long ans=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                max=1;
                min=1;
            }else if(arr[i]<0){
                long temp=max;
                max=min;
                min=temp;
            }

            max=Math.max(arr[i],arr[i]*max);
            min=Math.min(arr[i],arr[i]*min);

            ans=Math.max(ans,max);
        }

        return ans;
    }



    //TC:0(n)
    //SC:0(1)
    //Leetcode:
    public int maxProduct(int[] nums) {
        int max=1;
        int min=1;
        int ans=nums[0];
        int zero=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max=1;
                min=1;
                zero=1;
            }else if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }

            max=Math.max(nums[i],nums[i]*max);
            min=Math.min(nums[i],nums[i]*min);

            ans=Math.max(ans,max);
        }

        if( ans<0 && zero==1){
            return 0;
        }

        return ans;

    }
}
