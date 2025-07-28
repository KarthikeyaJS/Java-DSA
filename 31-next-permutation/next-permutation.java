class Solution {
    static void rev(int[] nums,int left,int right){
        while(left<=right){
            nums[left]=nums[left]+nums[right]-(nums[right]=nums[left]);
            left++;
            right--;
        }

    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i<0){
            rev(nums,0,n-1);
            return;
        }
        int j=n-1;
        while(nums[j]<=nums[i]){
            j--;
        }

        nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);

        rev(nums,i+1,n-1);
        
    }
}