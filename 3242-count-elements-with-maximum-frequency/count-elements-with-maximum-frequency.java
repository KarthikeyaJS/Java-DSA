class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        int maxi=0;
        for(int i:nums){
            freq[i]++;
            maxi=Math.max(maxi,freq[i]);
        }
        int ans=0;
        for(int i=1;i<=100;i++){
            if(freq[i]==maxi)   ans=ans+freq[i];
        }
        return ans;
    }
}