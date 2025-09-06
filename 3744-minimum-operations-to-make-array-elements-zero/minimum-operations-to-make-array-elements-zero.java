class Solution {
    static long stepsum(long n){
        if(n<=0)    return 0;
        long res=0;
        long base=1;
        long step=1;
        while(base<=n){
            long cnt=Math.min(n,base*4-1)-base+1;
            res=res+cnt*step;
            base=base*4;
            step++;
        }
        return res;
    }
    public long minOperations(int[][] queries) {
        long ans=0;
        for(int[] q:queries){
            long l=q[0];
            long r=q[1];
            long total=stepsum(r)-stepsum(l-1);
            ans=ans+(total+1)/2;
        }
        return ans;
    }
}