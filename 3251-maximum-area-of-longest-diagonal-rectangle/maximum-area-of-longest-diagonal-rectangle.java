class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxD=0;
        int maxA=0;
        for(int[] i:dimensions){
            double d=Math.sqrt(i[0]*i[0]+i[1]*i[1]);
            int a=i[0]*i[1];
            if(d>maxD){
                maxD=d;
                maxA=a;
            }
            else if(maxD==d && a>maxA){
                maxA=a;
            }
        }
        return maxA;
    }
}