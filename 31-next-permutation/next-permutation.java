class Solution {
    static void swap(int[] arr, int i,int j){
        arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
    }
    static void reverse(int arr[],int start){
        int i=start;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0);
        }
        else{
            int minIdx=-1;
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[idx]){
                    minIdx=i;
                    break;
                }
            }
            swap(nums,idx,minIdx);
            reverse(nums,idx+1);
        }
    }
}