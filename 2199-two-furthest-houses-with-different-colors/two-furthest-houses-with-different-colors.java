class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int maxi=0;
        for(int i=1;i<n;i++){
            if(colors[0]!=colors[i]){
                maxi=i;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(colors[n-1]!=colors[i]){
                maxi=Math.max(maxi,n-1-i);
            }
        }
        return maxi;

    }
}