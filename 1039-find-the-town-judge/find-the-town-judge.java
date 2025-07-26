class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count=new int[n+1];
        boolean[] bool=new boolean[n+1];
        int l=trust.length;
        for(int[] pair:trust){
            int a=pair[0];
            int b=pair[1];
            count[b]++;
            bool[a]=true;
        }
        for(int i=1;i<=n;i++){
            if(!bool[i] && count[i]==n-1)    return i;
        }
        return -1;
    }
}