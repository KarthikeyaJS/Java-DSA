class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> list=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1)    count++;
            }
            list.add(new int[]{i,count});
        }
        list.sort((a,b)->{
            if(a[1]!=b[1]) return Integer.compare(a[1],b[1]);
            else    return Integer.compare(a[0],b[0]);
        });
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i)[0];
        }
        return res;
    }
}