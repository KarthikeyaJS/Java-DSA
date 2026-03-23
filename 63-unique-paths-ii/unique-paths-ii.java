class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if(grid[0][0]==1)   return 0;
        int m=grid.length;
        int n=grid[0].length;
        int[][] mat=new int[m][n];

        mat[0][0]=1;
        for(int i=1;i<n;i++){
            if(grid[0][i]==1){
                mat[0][i]=0;
            }
            else{
                mat[0][i]=mat[0][i-1];
            }
        }
        for(int i=1;i<m;i++){
            if(grid[i][0]==1){
                mat[i][0]=0;
            }
            else{
                mat[i][0]=mat[i-1][0];
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]==1){
                    mat[i][j]=0;
                }
                else{
                    mat[i][j]=mat[i-1][j]+mat[i][j-1];
                }
            }
        }
        return mat[m-1][n-1];
    }
}