class Solution {
    public int longestContinuousSubstring(String s) {
        int n=s.length();
        int maxi=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)-s.charAt(i-1)==1){
                count++;
                maxi=Math.max(maxi,count);
            }
            else{
                count=1;
            }
        }
        return maxi;
    }
}