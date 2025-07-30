class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int maxi=0;
        for(int i:nums){
            maxi=Math.max(maxi,i);
        }
        int count=0;
        int maxCount=0;
        for(int i:nums){
            if(i==maxi){
                count++;
                maxCount=Math.max(maxCount,count);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
}