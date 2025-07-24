class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[][] mat=new boolean[8][8];
        for(int[] i :queens){
            mat[i[0]][i[1]]=true;
        }
        int[][] moves={
            {-1,0},{1,0},{0,1},{0,-1},{-1,-1},{-1,1},{1,-1},{1,1}
        };
        for(int m[]:moves){
            int dr=king[0];
            int dc=king[1];

            while(dr>=0 && dr<8 && dc>=0 && dc<8){
                dr+=m[0];
                dc+=m[1];

                if(dr<0 || dr>=8 || dc<0 || dc>=8)  break;
                if(mat[dr][dc]){
                    ans.add(Arrays.asList(dr,dc));
                    break;
                }
            }
        }
        return ans;
    }
}