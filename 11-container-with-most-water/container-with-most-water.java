class Solution {
    public int maxArea(int[] height) {
        int maxArea=0,area;
        int r=height.length-1;
        int l=0;
        while(l<r){
            int w=r-l;
            int h=Math.min(height[r],height[l]);
            area=h*w;
            maxArea=Math.max(maxArea,area);
            if(height[l]<height[r])  l++;
            else    r--;
        }
        return maxArea;
    }
}