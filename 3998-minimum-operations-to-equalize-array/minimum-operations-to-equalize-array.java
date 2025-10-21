class Solution {
    public int minOperations(int[] nums) {
        int x=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(x!=nums[i])  return 1;
        }   
        return 0;
    }
}