class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1)    return 1;
        int idx=0;
        for(int i=2;i<=n;i++){
            idx=(idx+k)%i;
        }
        return idx+1;
    }
}