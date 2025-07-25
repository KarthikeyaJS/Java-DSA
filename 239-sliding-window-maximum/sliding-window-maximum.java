class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>((a,b)->nums[b]-nums[a]);
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int idx=0;
        for(int i=0;i<n;i++){
            while(queue.size()>0 &&queue.peek()<=i-k){
                queue.remove();
            }
            queue.add(i);
            if(i>=k-1){
                ans[idx++]=nums[queue.peek()];
            }
        }
        return ans;
    }
}