class Solution {
    public boolean judgeCircle(String moves) {
        int pos1=0;
        int pos2=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L') pos1++;
            else if(ch=='R') pos1--;
            else if(ch=='U') pos2++;
            else if(ch=='D')       pos2--;
        }
        return pos1==0 && pos2==0;
    }
}