
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int d=0;d<m;d++){
            int i=0,j=d;
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            int x=i,y=j;
            while(i<n && j<m){
                pq.offer(mat[i][j]);
                i++;
                j++;
            }
            while(x<n && y<m){
                mat[x][y]=pq.poll();
                x++;
                y++;
            }
        }
        for(int d=1;d<n;d++){
            int i=d,j=0;
            int x=i,y=j;
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            while(i<n && j<m){
                pq.offer(mat[i][j]);
                i++;
                j++;
            }
            while(x<n &&y<m){
                mat[x][y]=pq.poll();
                x++;
                y++;
            }
        }
        return mat;
    }
}