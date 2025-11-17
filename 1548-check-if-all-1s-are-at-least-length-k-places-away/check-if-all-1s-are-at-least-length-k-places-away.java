class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count=0;
        int prev=(int)-1e9;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                if(i-prev<=k)   return false;
                prev=i;
            }
        }
        return true;
    }
}