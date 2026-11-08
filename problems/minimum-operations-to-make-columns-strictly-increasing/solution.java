class Solution {
    public int minimumOperations(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=1;j<n;j++){
                if(grid[j][i]-grid[j-1][i]<=0){
                    int d=grid[j-1][i]-grid[j][i]+1;
                    c=c+d;
                    grid[j][i]=grid[j][i]+d;
                }
            }
            ans=ans+c;
        }    
        return ans;
    }
}