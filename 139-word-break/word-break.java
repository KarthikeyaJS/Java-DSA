class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        int maxi=0;
        for(String w:wordDict){
            maxi=Math.max(maxi,w.length());
        }
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=Math.max(i-maxi,0);j--){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}