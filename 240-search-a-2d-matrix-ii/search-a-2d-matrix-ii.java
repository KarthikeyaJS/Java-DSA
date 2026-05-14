class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int rows=mat.length;
        int cols=mat[0].length;
        int r=0;
        int c=cols-1;
        while(r<rows && c>=0){
            if(mat[r][c]==target){
                return true;
            }
            else if(mat[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}