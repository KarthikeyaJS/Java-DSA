class Solution {
    public int findPeakElement(int[] nums) {
        int left=0,right=nums.length-1;
        if(right==0)    return 0;
        if(nums[right]>nums[right-1])    return right;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1])   right=mid;
            else    left=mid+1;
        }
        return left;
    }
}