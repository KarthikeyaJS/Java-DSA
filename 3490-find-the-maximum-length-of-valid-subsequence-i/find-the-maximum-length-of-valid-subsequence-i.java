class Solution {
    public int maximumLength(int[] nums) {
        int evenCount=0,oddCount=0,altCount=1;
        int prev=nums[0];
        if((prev&1)==0) evenCount++;
        else    oddCount++;

        int n=nums.length;
        for(int i=1;i<n;i++){
            if((nums[i]&1)==0)  evenCount++;
            else oddCount++;

            if((prev&1)!=(nums[i]&1)){
                altCount++;
                prev=nums[i];
            }
        }
        return Math.max(evenCount,Math.max(oddCount,altCount));
    }
}