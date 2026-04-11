class Solution {
    public double findMaxAverage(int[] arr, int k) {
       int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int maxi=sum;
        for(int i=k;i<n;i++){
            sum=sum+arr[i]-arr[i-k];
            if(sum>maxi)    maxi=sum;
        }
        return (double)maxi/k; 
    }
}