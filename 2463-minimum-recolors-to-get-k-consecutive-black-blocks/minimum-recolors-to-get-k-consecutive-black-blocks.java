class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int cnt=0;
            for(int j=0;j<k;j++){
                if('W'==blocks.charAt(i+j)){
                    cnt++;
                }
            }
            ans=Math.min(ans,cnt);
        }
        return ans;
    }
}