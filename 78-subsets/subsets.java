class Solution {
    static void backtrack(int[] nums,List<List<Integer>> res,List<Integer> subset,int start){
        res.add(new ArrayList<>(subset));
        for(int i=start;i<nums.length;i++){
            subset.add(nums[i]);
            backtrack(nums,res,subset,i+1);
            subset.remove(subset.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,res,new ArrayList<Integer>(),0);
        return res;
    }
}