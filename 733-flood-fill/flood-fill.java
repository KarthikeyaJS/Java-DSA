class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old=image[sr][sc];
        
        if(old==color)  return image;
        int m=image.length;
        int n=image[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{sr,sc});
        int[][] dirs={{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] arr=q.poll();
            int x=arr[0];
            int y=arr[1];
            if(image[x][y]!=old){
                continue;
            }
            image[x][y]=color;
            for(int[] d:dirs){
                int i=x+d[0];
                int j=y+d[1];
                if(i>=0 && i<m && j>=0 && j<n && image[i][j]==old){
                    q.offer(new int[]{i,j});
                }
            }
        }
        
        return image;
    }
}