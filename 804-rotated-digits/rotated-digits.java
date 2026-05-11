class Solution {
    static boolean isGood(int n){
        boolean found=false;
        while(n>0){
            int x=n%10;
            if(x==3|| x==4||x==7)   return false;
            if(x==2||x==5||x==6||x==9)  found=true;
            n=n/10;
        }
        return found;
    }
    public int rotatedDigits(int n) {

        int count=0;
        for(int i=1;i<=n;i++){
            if(isGood(i)){
                count++;
            }
        }
        return count;
    }
}