class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> q1=new PriorityQueue<>();
        PriorityQueue<Integer> q2=new PriorityQueue<>();
        int n=costs.length;
        for(int i=0;i<candidates;i++){
            q1.add(costs[i]);
        }
        for(int i=Math.max(candidates,n-candidates);i<n;i++){
            q2.add(costs[i]);
        }
        long ans=0;
        int nextq1=candidates;
        int nextq2=n-1-candidates;

        for(int i=0;i<k;i++){
            if(q2.isEmpty() || !q1.isEmpty() && q1.peek()<=q2.peek()){
                ans=ans+q1.poll();
                if(nextq1<=nextq2){
                    q1.add(costs[nextq1]);
                    nextq1++;
                }
            }
            else{
                ans=ans+q2.poll();
                if(nextq1<=nextq2){
                    q2.add(costs[nextq2]);
                    nextq2--;
                }
            }
        }
        return ans;

    }
}