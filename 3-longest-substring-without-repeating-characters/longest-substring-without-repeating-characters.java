class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxi=0,n=s.length();
        int l=0,r=0;
        HashSet<Character> hash=new HashSet<>();
        while(r<n){
            if(!hash.contains(s.charAt(r))){
                hash.add(s.charAt(r));
                maxi=Math.max(maxi,r-l+1);
                r++;
            }
            else{
                hash.remove(s.charAt(l));
                l++;
            }
        }
        return maxi;
    }
}