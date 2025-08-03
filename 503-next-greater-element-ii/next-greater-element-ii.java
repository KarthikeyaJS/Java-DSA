class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2*n];
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }
        for(int i=0;i<n;i++){
            res[i]=-1;
            for(int j=i+1;j<2*n;j++){
                if(arr[j]>nums[i]){
                    res[i]=arr[j];
                    break;
                }
            }
        }
        return res;
    }
}