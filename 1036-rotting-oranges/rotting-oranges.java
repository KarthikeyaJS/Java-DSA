class Solution {

    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] visited=grid;
        Queue<int[]> q=new LinkedList<>();
        int countFresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==2)    q.offer(new int[]{i,j});
                if(visited[i][j]==1)    countFresh++;
            }
        }
        if(countFresh==0)   return 0;
        if(q.isEmpty())     return -1;
        int minutes=-1;
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size=q.size();
            while(size-- >0){
                int[] cell=q.poll();
                int x=cell[0];
                int y=cell[1];
                for(int[] d:directions){
                    int i=x+d[0];
                    int j=y+d[1];
                    if(i>=0&& i<m && j>=0 && j<n && visited[i][j]==1){
                        visited[i][j]=2;
                        countFresh--;
                        q.offer(new int[]{i,j});
                    }
                }
            }
            minutes++;
        }
        if(countFresh==0)   return minutes;
        return -1;
    }
}