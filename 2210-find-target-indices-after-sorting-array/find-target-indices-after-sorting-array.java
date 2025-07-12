class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less=0;
        int equal=0;
        for(int i:nums){
            if(i==target)   equal++;
            if(i<target)    less++;
        }
        List<Integer> list=new ArrayList<>();
        if(equal==0)    return list;

        for(int i=0;i<equal;i++){
            list.add(less+i);
        }
        return list;
    }
}