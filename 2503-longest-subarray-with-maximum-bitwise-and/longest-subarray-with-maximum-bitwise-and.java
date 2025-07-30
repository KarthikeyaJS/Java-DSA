class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int maxi=0;
        for(int i:nums){
            maxi=Math.max(maxi,i);
        }
        int count=1;
        int maxCount=1;
        for(int i=0;i<n;i++){
            if(i+1<n && maxi==nums[i] && nums[i]==nums[i+1]){
                count++;
                maxCount=Math.max(maxCount,count);
            } 
            else{
                count=1;
            }
        }
        return maxCount;
    }
}