class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l=0;
        int r=mat.length-1;
        while (l<r){
            int mid=l+(r-l)/2;
            int j=maxi(mat[mid]);
            if(mat[mid][j]>mat[mid+1][j]){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return new int[]{l,maxi(mat[l])};
    }
    static int maxi(int[] arr){
        int j=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[j]<arr[i]){
                j=i;
            }
        }
        return j;
    }
}