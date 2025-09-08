class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            boolean t=true;
            boolean f=true;
            int x=n-i;
            int y=i;
            while(y>0){
                if(y%10==0){
                    t=false;
                    break;
                }
                y /=10;
            }
            while(x>0){
                if(x%10==0){
                    f=false;
                    break;
                }
                x /=10;
            }
            if(t && f)return new int[]{i,n-i};

        }
        return new int[]{1,n-1};
    }
}