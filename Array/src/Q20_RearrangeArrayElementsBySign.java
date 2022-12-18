

public class Q20_RearrangeArrayElementsBySign {

    //Leetcode : https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
    public int[] rearrangeArray(int[] nums) {
        //TC:0(n)
        //SC:0(1)
        int[] ans=new int[nums.length];
        int pos=0;
        int neg=1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
    }
}
