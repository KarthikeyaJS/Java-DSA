class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
                int val=nums[i];
                nums[Math.abs(val)-1]= -Math.abs(nums[Math.abs(val)-1]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0)     list.add(i+1);
        }
        return list;
    }
}