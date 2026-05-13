class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        int curr=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<=curr){
                curr++;
                count=count+curr-nums[i];
            }
            else{
                curr=nums[i];
            }
        }
        return count;
    }
}