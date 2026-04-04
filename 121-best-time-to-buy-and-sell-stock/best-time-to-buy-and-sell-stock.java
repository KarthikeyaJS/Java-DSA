class Solution {
    public int maxProfit(int[] prices) {
        int maxi=Integer.MIN_VALUE;
        int mini=prices[0];
        for(int p:prices){
            mini=Math.min(mini,p);
            maxi=Math.max(maxi,p-mini);
        }
        return maxi;
    }
}