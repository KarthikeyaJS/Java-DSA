class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int j=0;
        int l,maxi=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            // if(map.get(nums[i])>k){
                while(map.get(nums[i])>k){
                    map.put(nums[j],map.get(nums[j])-1);
                    j++;
                }
            // }
            l=i-j+1;
            maxi=Math.max(maxi,l);
        }
        return maxi;
    }
}