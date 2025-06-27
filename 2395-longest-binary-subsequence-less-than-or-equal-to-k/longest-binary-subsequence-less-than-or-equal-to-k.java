class Solution {
    public int longestSubsequence(String s, int k) {
        int count=0;
        int num=0;
        int pow=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='0') count++;
            else{
                if(pow<31){
                    if(num+(1<<pow)<=k){
                        num=num+(1<<pow);
                        count++;
                    }
                }
            }
            pow++;
        } 
        return count;
    }
}