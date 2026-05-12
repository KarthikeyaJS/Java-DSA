class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int maxi=0;
        for(int i=n-1;i>0;i--){
            if(colors[i]!=colors[0]){
                maxi=Math.max(maxi,i);
            }
        }
        for(int i=0;i<n-1;i++){
            if(colors[i]!=colors[n-1]){
                maxi=Math.max(maxi,n-1-i);
            }
        }
        return maxi;
    }
}