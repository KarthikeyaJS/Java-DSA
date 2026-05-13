class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int m=arr.length;
        for(int i=0;i<m;i++){
            if((i==0 || arr[i-1]==0) && (i==m-1 || arr[i+1]==0) && arr[i]==0 ){
                arr[i]=1;
                n--;
            }
        }
        return n<=0;
    }
}
 