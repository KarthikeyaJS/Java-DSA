class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int j=i;
                while(j<n && nums[j]==0){
                    j++;
                }

                int l=j-i;
                // System.out.println(i+""+j+""+l);
                i=j;
                sum=sum+(long)l*(l+1)/2;
            }
        }   
        return sum;
    }
}