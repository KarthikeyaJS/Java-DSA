class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        int mincost=0;
        if(n<=2){
            for(int i:cost){
                mincost+=i;
            }
            return mincost;
        }
        Arrays.sort(cost);
        int i=n-1;
        for(;i>=2;i-=3){
            mincost+=cost[i]+cost[i-1];
        }
        if(i==1)    mincost+=(cost[0]+cost[1]);
        if(i==0)    mincost+=cost[0];
        return mincost;
    }
}