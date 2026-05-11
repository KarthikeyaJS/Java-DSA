class Solution {
    public int numOfSubarrays(int[] arr, int k, int avg) {
        int count=0;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum/k >=avg){
            count++;
        }
        for(int i=k;i<n;i++){
            sum=sum-arr[i-k];
            sum=sum+arr[i];
            if(sum/k >= avg){
                count++;
            }
        }
        return count;
    }
}