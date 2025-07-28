class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int count=0;
        for(int i:nums) if(i==x)    count++;
        int[] pos=new int[count];
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x)  pos[p++]=i;
        }
        int n=queries.length;
        for(int i=0;i<n;i++){
            queries[i]=(queries[i]<=count)?pos[queries[i]-1]  :-1;
        }
        return queries;
    }
}