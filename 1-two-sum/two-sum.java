class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int n=nums.length;
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int x=target-nums[i];
            if(hash.containsKey(x)){
                res[0]=hash.get(x);
                res[1]=i;
                return res;
            }
            else{
                hash.put(nums[i],i);
            }
        }
        return res;
    }
}