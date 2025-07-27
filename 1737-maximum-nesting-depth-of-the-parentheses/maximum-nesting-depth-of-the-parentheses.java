class Solution {
    public int maxDepth(String s) {
        int c=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                c++;
                ans=Math.max(ans,c);
                continue;
            }
            else if(ch==')'){
                if(c>0) c--;
            }
        }
        return ans;
    }
}