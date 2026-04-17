class Solution {
    static int gcd(int a,int b){
        if(b==0)    return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i:nums){
            maxi=Math.max(i,maxi);
            mini=Math.min(mini,i);
        }
        return gcd(maxi,mini);
    }
}