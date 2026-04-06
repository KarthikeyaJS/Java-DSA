class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i:nums){
            total=total+i;
        }
        int left=0;
        for(int i=0;i<n;i++){
            int right=total-nums[i]-left;
            if(right==left){
                return i;
            } 
            left=left+nums[i];
        }
        return -1;
        
    }
}