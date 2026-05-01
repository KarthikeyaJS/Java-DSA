class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum=0;
        int f=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            f=f+(i*nums[i]);            
        }
        int maxi=f;
        for(int i=1;i<n;i++){
            f=f+(sum-n*nums[n-i]);
            maxi=Math.max(maxi,f);
        }
        return maxi;
    }
}