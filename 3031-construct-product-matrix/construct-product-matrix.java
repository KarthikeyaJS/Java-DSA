class Solution {
    static int MOD=12345;    
    public int[][] constructProductMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] p=new int[m][n];

        long suffix=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                p[i][j]=(int)suffix;
                suffix=(suffix*grid[i][j])%MOD;
            }
        }

        long prefix=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                p[i][j]=(int)((prefix*(long)p[i][j])%MOD);
                prefix=(prefix*grid[i][j])%MOD;
            }
        }
        return p;
    }
}