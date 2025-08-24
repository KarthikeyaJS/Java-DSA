class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,count=0,res=0;
        int n=nums.length;
        for(int r=0;r<n;r++){
            if(nums[r]==0)  count++;
            while(count>1){
                if(nums[l]==0)  count--;
                l++;
            }
            res=Math.max(res,r-l);
        }
        return res;
    }
}