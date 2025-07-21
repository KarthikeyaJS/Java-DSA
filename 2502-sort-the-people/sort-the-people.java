class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map=new HashMap<>();
        int n=heights.length;
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }

        Arrays.sort(heights);
        String[] res=new String[n];
        for(int i=0;i<n;i++){
            res[i]=map.get(heights[n-i-1]);
        }
        return res;
    }
}