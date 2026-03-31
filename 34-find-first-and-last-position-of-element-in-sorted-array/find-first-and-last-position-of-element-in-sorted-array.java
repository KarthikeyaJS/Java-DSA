
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                int i=mid,j=mid;
                while(i>=0 && nums[i]==target){
                    i--;
                }
                while(j<nums.length && nums[j]==target){
                    j++;
                }
                res[0]=i+1;
                res[1]=j-1;
                return res;

            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
}