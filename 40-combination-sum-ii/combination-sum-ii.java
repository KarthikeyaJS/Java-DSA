class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        backtrack(arr,target,res,new ArrayList<Integer>(),0);
        return res;
    }
    static void backtrack(int[] arr, int target,List<List<Integer>> res, ArrayList<Integer> subList,int start){
        if(target==0){
            res.add(new ArrayList<Integer>(subList));
            return;
        }
        if(start<arr.length-1&&(target<0 || arr[start]>target) )   return;

        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1]) continue;

            subList.add(arr[i]);
            backtrack(arr,target-arr[i],res,subList,i+1);
            subList.remove(subList.size()-1);
        }
    }
}