class Solution {
    static int rob1(int[] nums){
        int n=nums.length;
        if(n==1)    return nums[0];
        if(n==2)    return Math.max(nums[1],nums[0]);
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)    return 0;
        if(n==1)    return nums[0];
        int[] arr1=Arrays.copyOfRange(nums,0,n-1);
        int[] arr2=Arrays.copyOfRange(nums,1,n);
        int n1=rob1(arr1);
        int n2=rob1(arr2);
        return Math.max(n1,n2);
    }
}