class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> row=new HashSet<>();
            HashSet<Character> col=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !row.add(board[i][j]))   return false;
                if(board[j][i]!='.' && !col.add(board[j][i]))   return false;
            }
        }        
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Character> box=new HashSet<>();
                for(int r=0;r<3;r++){
                    for(int c=0;c<3;c++){
                        char ch=board[i+r][j+c];
                        if(ch!='.' && !box.add(ch)) return false;
                    }
                }
            }
        }
        return true;
    }
}

