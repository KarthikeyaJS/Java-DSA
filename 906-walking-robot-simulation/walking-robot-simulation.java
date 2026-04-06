class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> set=new HashSet<>();
        for(int[] arr:obstacles){
            set.add(arr[0]+","+arr[1]);
        }
        int x=0,y=0;
        int dirIdx=0;
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        int maxi=0;

        for(int c:commands){
            if(c==-1){
                dirIdx=(dirIdx+1)%4;
            }
            else if(c==-2){
                dirIdx=(dirIdx+3)%4;
            }
            else{
                int dx=directions[dirIdx][0];
                int dy=directions[dirIdx][1];
                int steps=0;
                while(steps<c){
                    int nextX=x+dx;
                    int nextY=y+dy;
                    String nextPos=nextX+","+nextY;
                    if(set.contains(nextPos)){
                        break;
                    }
                    steps++;
                    maxi=Math.max(maxi,x*x+y*y);
                    x=nextX;
                    y=nextY;
                }
            }

        }
         maxi=Math.max(maxi,x*x+y*y);
        return maxi;
    }
}