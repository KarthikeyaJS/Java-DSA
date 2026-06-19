class Solution {
    public int largestAltitude(int[] gain) {
        int x=0;
        int maxi=gain[0];
        for(int i:gain){
            x=x+i;
            if(x>0){
                maxi=Math.max(maxi,x);
            }
        }
        return maxi<0?0:maxi;
    }
}