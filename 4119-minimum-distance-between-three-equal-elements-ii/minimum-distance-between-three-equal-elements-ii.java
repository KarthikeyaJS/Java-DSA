class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int[] next=new int[n];
        Arrays.fill(next,-1);
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=Integer.MAX_VALUE;

        for(int i=n-1;i>=0;i--){
            if(map.containsKey(nums[i])){
                next[i]=map.get(nums[i]);
            }
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int secondPos=next[i];
            if(secondPos!=-1){
                int thirdPos=next[secondPos];
                if(thirdPos!=-1){
                    ans=Math.min(ans,thirdPos-i);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans*2;
    }
}