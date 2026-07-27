class Solution {
    public int minSwaps(int[] nums) {
        List<Integer> evenIdx=new ArrayList<>();
        List<Integer> oddIdx=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                evenIdx.add(i);
            }
            else{
                oddIdx.add(i);
            }
        }
        int evenCnt=evenIdx.size();
        int oddCnt=oddIdx.size();
        if(Math.abs(evenCnt-oddCnt)>1){
            return -1;
        }
        int ans=Integer.MAX_VALUE;
        if(evenCnt>=oddCnt){
            ans=Math.min(ans,helper(evenIdx));
        }
        if(oddCnt>=evenCnt){
            ans=Math.min(ans,helper(oddIdx));
        }
        return ans;
    }
    public static int helper(List<Integer> idx){
        int swap=0;
        for(int i=0;i<idx.size();i++){
            swap=swap+Math.abs(idx.get(i)-2*i);
        }
        return swap;
    }
}