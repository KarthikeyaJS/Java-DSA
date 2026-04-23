class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long[] ans=new long[n];
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }        
        for(List<Integer> pos:map.values()){
            long sum=0;
            for(int x:pos){
                sum=sum+x;
            }
            long leftSum=0;
            int m=pos.size();

            for(int i=0;i<m;i++){
                long rightSum=sum-leftSum-pos.get(i);
                long left=(long)pos.get(i)*i-leftSum;
                long right=rightSum-(long)pos.get(i)*(m-i-1);
                ans[pos.get(i)]=left+right;
                leftSum=leftSum+pos.get(i);
            }
        }
        return ans;
    }
}