class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        permute(0,nums,ans);
        return ans;
    }
    static void swap(int i,int j,int[] arr){
        arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
    }
    static void permute(int idx,int[] nums,List<List<Integer>> ans){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int num:nums)   temp.add(num);
            ans.add(new ArrayList<>(temp));
            return ;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if(set.contains(nums[i]))   continue;
            set.add(nums[i]);

            swap(i,idx,nums);
            permute(idx+1,nums,ans);
            swap(i,idx,nums);
        }
    }
}