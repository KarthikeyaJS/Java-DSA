class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(p1,p2)->Integer.compare(p1[1],p2[1]));
        int count=1;
        int n=points.length;
        
        System.out.println(points[0][0]+""+points[0][1]);
        int currEnd=points[0][1];
        System.out.println(currEnd);
        for(int i=0;i<n;i++){
            if(points[i][0]>currEnd){
                count++;
                currEnd=points[i][1];
            }
        }
        return count;
    }
}