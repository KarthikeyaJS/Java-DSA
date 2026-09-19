class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=target-nums[i];
            if(map.containsKey(x)){
                res[0]=map.get(x);
                res[1]=i;
                return res;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}