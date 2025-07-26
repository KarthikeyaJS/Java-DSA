class Solution {
    static void bfs(char[][] grid,int row,int col){
        int[][] directions ={{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{row,col});
        grid[row][col]='0';
        while(!queue.isEmpty()){
            int[] curr=queue.poll();
            for(int[] d:directions){
                int x=curr[0]+d[0];
                int y=curr[1]+d[1];
                if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]=='1'){
                    queue.add(new int[]{x,y});
                    grid[x][y]='0';
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    bfs(grid,i,j);
                }
            }
        }
        return count;
    }
}