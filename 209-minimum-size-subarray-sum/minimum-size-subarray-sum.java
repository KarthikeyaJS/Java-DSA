class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int start=0,sum=0;
        int length=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            while(sum>=target){
                length=Math.min(length,i-start+1);
                sum=sum-nums[start];
                start++;
            }
        }
        return length==Integer.MAX_VALUE?0:length;
    }
}