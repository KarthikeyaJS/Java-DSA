class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+2];
        for(int i:nums){
            if(i>0 && i<=n) arr[i]++;
        }
        for(int i=1;i<=n;i++){
            if(arr[i]==0)   return i;
        }
        return n+1;
    }
}