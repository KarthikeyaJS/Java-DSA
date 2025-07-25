class Solution {
    public boolean squareIsWhite(String c1) {
        int x= (c1.charAt(0)-'a') +( c1.charAt(1)-'0');
        return (x&1)==0;
    }
}