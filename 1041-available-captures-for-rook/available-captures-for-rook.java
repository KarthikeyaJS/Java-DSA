class Pos{
    int x;
    int y;
    Pos(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int numRookCaptures(char[][] board) {
        int count=0;
        Pos rook=null;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    rook=new Pos(i,j);
                    break;
                }  
            }
            if(rook!=null)  break;
        }
        int[][] moves={{-1,0},{1,0},{0,1},{0,-1}};
        for(int[] m:moves){
            int x=rook.x;
            int y=rook.y;
            while(true){
                x+=m[0];
                y+=m[1];
                if(x<0 || x>=8||y<0||y>=8)  break;
                if(board[x][y]=='B')    break;
                if(board[x][y]=='p'){
                    count++;
                    break;
                }      
            }
            
        }
        return count;

    }
}