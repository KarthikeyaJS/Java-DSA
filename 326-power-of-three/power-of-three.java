class Solution {
    public boolean isPowerOfThree(int n) {
        int maxPow=1162261467;
        return n>0 && maxPow%n==0;
    }
}