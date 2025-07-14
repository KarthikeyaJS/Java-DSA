class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int left=0;
        int n=nums.length;
        int right=n-1;
        int[] res=new int[n];
        for(int i=0,j=n-1;i<n;i++,j--){
            if(nums[i]<pivot){
                res[left]=nums[i];
                left++;
            }
            if(nums[j]>pivot){
                res[right]=nums[j];
                right--;
            }
        }
        while(left<=right){
            res[left]=pivot;
            left++;
        }
        return res;
    }
}