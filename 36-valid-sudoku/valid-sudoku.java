class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> row=new HashSet<>();
            HashSet<Character> col=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !row.add(board[i][j])) return false;
                if(board[j][i]!='.' && !col.add(board[j][i])) return false;
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Character> box=new HashSet<>();
                for(int sr=0;sr<3;sr++){
                    for(int sc=0;sc<3;sc++){
                        char ch=board[sr+i][sc+j];
                        if(ch!='.' && !box.add(ch)) return false;
                    }
                }
            }
        }
        return true;
    }
}