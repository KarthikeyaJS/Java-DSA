class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int keys:map.keySet()){
            if(k==0){
                if(map.get(keys) >=2)  count++;
            }
            else{
                if(map.containsKey(keys+k)) count++;
            }
        }
        return count;
    }
}