class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int ans=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i+2<m;i++){
            for(int j=0;j+2<n;j++){
                if(isMagicSquare(i,j,grid))     ans++;
            }
        }
        return ans;
    }
    static boolean isMagicSquare(int row,int col,int[][] grid){
        String pattern="2943816729438167";
        String patternRev="7618349276183492";
        StringBuilder border=new StringBuilder();

        int[] idx=new int[]{0,1,2,5,8,7,6,3};
        for(int i:idx){
            int num=grid[row+i/3][col+(i%3)];
            border.append(num);
        }
        String s=border.toString();
        return ( (pattern.contains(s)||patternRev.contains(s))  &&
         grid[row+1][col+1]==5  &&
         (grid[row][col]&1)==0 );
    }
}