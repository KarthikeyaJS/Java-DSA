class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int mini=Integer.MAX_VALUE;
        int n=nums.length;
        if(n==1)    return 0;
        for(int i=k-1;i<n;i++){
            mini=Math.min(mini,nums[i]-nums[i-k+1]);
        }
        return mini;
    }
}