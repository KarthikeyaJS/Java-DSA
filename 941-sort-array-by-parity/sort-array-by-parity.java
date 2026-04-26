class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if((nums[i]&1)==0){
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
        return nums;
    }
}