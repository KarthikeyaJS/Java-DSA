class Solution {
    static boolean search(char[][]maze, String word,int row,int col,int idx){
        if(idx==word.length()){
            return true;
        }
        if(row<0 || col<0 || row>=maze.length || col>=maze[0].length|| maze[row][col]!=word.charAt(idx)){
            return false;
        }
        maze[row][col]='*';
        int[][] dirs={{-1,0},{1,0},{0,1},{0,-1}};
        for(int i=0;i<4;i++){
            boolean ans=search(maze,word,row+dirs[i][0],col+dirs[i][1],idx+1);
            if(ans)     return ans;
        }
        maze[row][col]=word.charAt(idx);
        return false;
    }

    public boolean exist(char[][] maze, String word) {
        int m=maze.length;
        int n=maze[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(maze[i][j]==word.charAt(0)){
                    boolean ans=search(maze,word,i,j,0);
                    if(ans) return ans;
                }
            }
        }
        return false;
    }
}