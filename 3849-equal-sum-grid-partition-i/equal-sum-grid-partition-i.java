class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long total=0;
        long[] rows=new long[m];
        long[] cols=new long[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                total=total+grid[i][j];
                rows[i]=rows[i]+grid[i][j];
                cols[j]=cols[j]+grid[i][j];
            }
        }
        if((total&1)==1)    return false;
        if(check(rows,total))   return true;
        if(check(cols,total))   return true;
        return false;
    }
    static boolean check(long[] arr,long total){
        long left=arr[0];
        long right=total-left;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(left==right) return true;
            else if(left>right)  return false;
            else{
                left=left+arr[i];
                right=right-arr[i];
            }
        }
        return false;
    }
}