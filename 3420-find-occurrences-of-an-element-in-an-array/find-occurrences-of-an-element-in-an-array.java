class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int occ=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==x){
                map.put(++occ,i);
            }
        }
        int m=queries.length;
        int[] res=new int[m];
        for(int i=0;i<m;i++){
            if(map.containsKey(queries[i])){
                res[i]=map.get(queries[i]);
            }
            else{
                res[i]=-1;
            }
        }
        return res;
    }
}