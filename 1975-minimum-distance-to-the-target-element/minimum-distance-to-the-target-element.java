class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int result=nums.length;
        int n=result;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                result=Math.min(result,Math.abs(i-start));
            }
        }
        return result;
    }
}