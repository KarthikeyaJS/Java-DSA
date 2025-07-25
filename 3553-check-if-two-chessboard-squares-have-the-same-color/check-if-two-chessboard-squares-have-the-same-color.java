class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int first=(c1.charAt(0)-'a')+(c1.charAt(1)-'0');
        int second=(c2.charAt(0)-'a')+(c2.charAt(1)-'0');
        return (first&1) == (second&1 );
    }
}