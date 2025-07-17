class KthLargest {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i:nums){
            if(pq.size()==k){
                if(i>pq.peek()){
                    pq.poll();
                    pq.add(i);
                }
            }
            else{
                pq.add(i);
            }
        }
    }
    
    public int add(int val) {
        if(pq.size()<k) pq.add(val);
        else{
            if(val>pq.peek()){
                pq.poll();
                pq.add(val);
            }
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */